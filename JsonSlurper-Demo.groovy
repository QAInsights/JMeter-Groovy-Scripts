import groovy.json.JsonSlurper;
import groovy.json.JsonOutput

def contacts = '''
{
  "firstName": "John",
  "lastName" : "doe",
  "age"      : 26,
  "address"  : {
    "streetAddress": "naist street",
    "city"         : "Nara",
    "postalCode"   : "630-0192"
  },
  "phoneNumbers": [
    {
      "type"  : "iPhone",
      "number": "0123-4567-8888"
    },
    {
      "type"  : "home",
      "number": "0123-4567-8910"
    }
  ]
}
'''

def jsonSlurper = new JsonSlurper();
def json = jsonSlurper.parseText(contacts);
json.phoneNumbers[0].type = '+81';

println json.phoneNumbers[0].type;


// def jsonSlurper = new JsonSlurper()
// def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')
// object.age = 11
// println object.age
// println object.toString()