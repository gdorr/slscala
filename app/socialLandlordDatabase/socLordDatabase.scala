package socialLandlordDatabase
import scala.io;
import scala.collection.mutable._
import javax.inject._

class landlord {
    var ID: String=""
    var Landlord: String=""
    var RPCode: String=""
    var RegAddr= Array("","","","","")
    var Postcode: String=""
    var Phone: String=""
    var Designation: String=""
    var RegDate: String=""
    var LegalEntity: String=""
    var Country: String=""
    var UCLSEmail: String=""
    var UCFSEmai: String=""
    var FirstContact: String=""
    var Email: String=""
}

class localAuthority {
  var ID: String=""
  var TA: String=""
  var PossiblePRPName: String=""
  var RegisterPRPName: String=""
  var PRPregistrationNumber: String=""
  var LocalAuthority: String=""
  var TotalHousingStock: String=""
}

@Singleton object socLordDB {
  var socLords: ListBuffer[landlord]=ListBuffer()
  var localAuthorities: ListBuffer[localAuthority]=ListBuffer()
  prepare()
  
  def prepare() = {
    scala.io.Source.fromFile("uc-landlords.txt").getLines().drop(1).foreach ( l => {
      var newl=new landlord()
      var i = l.split(",")
        newl.ID=i(0).stripPrefix("\"").stripSuffix("\"")
        newl.Landlord=i(1).stripPrefix("\"").stripSuffix("\"")
        newl.RPCode=i(2).stripPrefix("\"").stripSuffix("\"")
        newl.RegAddr(0)=i(3).stripPrefix("\"").stripSuffix("\"")
        newl.RegAddr(1)=i(4).stripPrefix("\"").stripSuffix("\"")
        newl.RegAddr(2)=i(5).stripPrefix("\"").stripSuffix("\"")
        newl.RegAddr(3)=i(6).stripPrefix("\"").stripSuffix("\"")
        newl.RegAddr(4)=i(7).stripPrefix("\"").stripSuffix("\"")
        newl.Postcode=i(8).stripPrefix("\"").stripSuffix("\"")
        newl.Phone=i(9).stripPrefix("\"").stripSuffix("\"")
        newl.Designation=i(10).stripPrefix("\"").stripSuffix("\"")
        newl.RegDate=i(11).stripPrefix("\"").stripSuffix("\"")
        newl.LegalEntity=i(12).stripPrefix("\"").stripSuffix("\"")
        newl.Country=i(13).stripPrefix("\"").stripSuffix("\"")
        newl.UCLSEmail=i(14).stripPrefix("\"").stripSuffix("\"")
        newl.UCFSEmai=i(15).stripPrefix("\"").stripSuffix("\"")
        newl.FirstContact=i(16).stripPrefix("\"").stripSuffix("\"")
        newl.Email=i(17).stripPrefix("\"").stripSuffix("\"")
        socLords+=newl
      })
      
      scala.io.Source.fromFile("uc-LocalAuthorities.txt").getLines().drop(1).foreach ( l => {
        var newl=new localAuthority()
        var i = l.split(",")
          newl.ID=i(0).stripPrefix("\"").stripSuffix("\"")
          newl.TA=i(1).stripPrefix("\"").stripSuffix("\"")
          newl.PossiblePRPName=i(2).stripPrefix("\"").stripSuffix("\"")
          newl.RegisterPRPName=i(3).stripPrefix("\"").stripSuffix("\"")
          newl.PRPregistrationNumber=i(4).stripPrefix("\"").stripSuffix("\"")
          newl.LocalAuthority=i(5).stripPrefix("\"").stripSuffix("\"")
          newl.TotalHousingStock=i(6).stripPrefix("\"").stripSuffix("\"")
          localAuthorities+=newl
      })
    }

    def getFiltered(LocalAuthority: String) : ListBuffer[landlord] = {
      var l=new ListBuffer[landlord]
      for (la <- localAuthorities if la.LocalAuthority==LocalAuthority) {
         for(ll <- socLords if ll.RPCode==la.PRPregistrationNumber) l+=ll
    } 
/*      
      for (var y = 0; y < la_localAuthorities.length; y++) {
                if (la_postcodes[x].LA === la_localAuthorities[y].LocalAuthority) {
                    for (var z = 0; z < la_landlords.length; z++) {
                        if (la_landlords[z]["RP Code"] === la_localAuthorities[y]["PRPregistration number"]) {
                            landlords.push(la_landlords[z]);
                        }
                    }
                }
            }*/

      return l
    }
  }
