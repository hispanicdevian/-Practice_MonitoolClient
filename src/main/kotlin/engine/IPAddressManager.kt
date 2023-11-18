package engine

object IPFileHandler {

// A - 0
    fun saveIPAddressA(ipAddress: String) {
        // Assign the input value directly to the variable
        EngineIPList.ipAddress0 = ipAddress
    }
    fun readIPAddressA(): String {
        // Return the value of the original variable
        return EngineIPList.ipAddress0
    }

// B - 1
    fun saveIPAddressB(ipAddress: String) {
        // Assign the input value directly to the variable
        EngineIPList.ipAddress1 = ipAddress
    }
    fun readIPAddressB(): String {
        // Return the value of the original variable
        return EngineIPList.ipAddress1
    }

// C - 2
    fun saveIPAddressC(ipAddress: String) {
        // Assign the input value directly to the variable
        EngineIPList.ipAddress2 = ipAddress
    }
    fun readIPAddressC(): String {
        // Return the value of the original variable
        return EngineIPList.ipAddress2
    }

// D - 3
    fun saveIPAddressD(ipAddress: String) {
        // Assign the input value directly to the variable
        EngineIPList.ipAddress3 = ipAddress
    }
    fun readIPAddressD(): String {
        // Return the value of the original variable
        return EngineIPList.ipAddress3
    }
}
