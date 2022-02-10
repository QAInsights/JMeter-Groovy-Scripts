import groovy.json.JsonSlurper;
import groovy.json.JsonOutput;
import groovy.json.JsonBuilder;

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
}'''

def jsonSlurper = new JsonSlurper().parseText(contacts);
def builder = new JsonBuilder(jsonSlurper)

def rdm = UUID;
println rdm.randomUUID().toString();

for (int i=0; i <= 10; i++){
  // println builder.content.phoneNumbers[i];
  builder.content.phoneNumbers = rdm.randomUUID().toString();
}
println(builder.toPrettyString())

// def jsonSlurper = new JsonSlurper()
// def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')
// object.age = 11
// println object.age
// println object.toString()