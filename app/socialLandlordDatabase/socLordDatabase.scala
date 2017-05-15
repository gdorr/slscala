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
  
 
  def procstr(s: String): String = {
    return s.stripPrefix("\"").stripSuffix("\"").toUpperCase()
}

  def prepare() = {
    scala.io.Source.fromFile("uc-landlords.txt").getLines().drop(1).foreach ( l => {
      var newl=new landlord()
      var i = l.split(",")
        newl.ID=procstr(i(0))
        newl.Landlord=procstr(i(1))
        newl.RPCode=procstr(i(2))
        newl.RegAddr(0)=procstr(i(3))
        newl.RegAddr(1)=procstr(i(4))
        newl.RegAddr(2)=procstr(i(5))
        newl.RegAddr(3)=procstr(i(6))
        newl.RegAddr(4)=procstr(i(7))
        newl.Postcode=procstr(i(8))
        newl.Phone=procstr(i(9))
        newl.Designation=procstr(i(10))
        newl.RegDate=procstr(i(11))
        newl.LegalEntity=procstr(i(12))
        newl.Country=procstr(i(13))
        newl.UCLSEmail=procstr(i(14))
        newl.UCFSEmai=procstr(i(15))
        newl.FirstContact=procstr(i(16))
        newl.Email=procstr(i(17))
        socLords+=newl
      })
      
      scala.io.Source.fromFile("uc-LocalAuthorities.txt").getLines().drop(1).foreach ( l => {
        var newl=new localAuthority()
        var i = l.split(",")
          newl.ID=procstr(i(0))
          newl.TA=procstr(i(1))
          newl.PossiblePRPName=procstr(i(2))
          newl.RegisterPRPName=procstr(i(3))
          newl.PRPregistrationNumber=procstr(i(4))
          newl.LocalAuthority=procstr(i(5))
          newl.TotalHousingStock=procstr(i(6))
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
