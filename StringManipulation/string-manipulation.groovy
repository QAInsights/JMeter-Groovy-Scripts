static def genRandom() {
    Random r = new Random()
    return r.nextInt(4).toString()
}

def orgId = "6618dd51-1e8f-4b61-a21f-cdb5795f38b1"
println(orgId)
// Finding the last character of a string
def lastChar = orgId[orgId.length()-1]
println(lastChar)
def asset

// Generating random number between 0 and 4
def r = genRandom()

// if lastChar == random number, else, use the generated random number
if (lastChar == r) {
    def nr = ['0','1','2','3','4']
    // removing it from the array
    nr -= r
    print(nr)
    // replacing the last character with the first element of the array
    asset = orgId.replace(lastChar, nr[0].toString())
    println(asset.toString())
}
else {
    asset = orgId.replace(lastChar, r)
    println(asset.toString())
}


