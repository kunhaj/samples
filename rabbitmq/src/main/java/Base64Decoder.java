import java.util.Base64;

public class Base64Decoder {

    public static void main(String[] args) {
        String message =  "rO0ABXd4AC5jb20ucmFiYml0bXEuam1zLmNsaWVudC5tZXNzYWdlLlJNUVRleHRNZXNzYWdlACRhZWFmZmI2OS0zZjVhLTRlZTAtOTIwMC1jY2I0OWE2YzRi\n" +
                "ZjEAAAAGABtybXEuam1zLm1lc3NhZ2UuZGVzdGluYXRpb25/c3IAJWNvbS5yYWJiaXRtcS5qbXMuYWRtaW4uUk1RRGVzdGluYXRpb24ISNmNldEmKQIAB1oA\n" +
                "BGFtcXBaAAdpc1F1ZXVlWgALaXNUZW1wb3JhcnlMABBhbXFwRXhjaGFuZ2VOYW1ldAASTGphdmEvbGFuZy9TdHJpbmc7TAANYW1xcFF1ZXVlTmFtZXEAfgAB\n" +
                "TAAOYW1xcFJvdXRpbmdLZXlxAH4AAUwAD2Rlc3RpbmF0aW9uTmFtZXEAfgABeHAAAQB0ABJqbXMuZHVyYWJsZS5xdWV1ZXN0ABRURVNULVFVRVVFLVRFWFQt\n" +
                "T05MWXEAfgAEcQB+AAR3zgAdcm1xLmptcy5tZXNzYWdlLmRlbGl2ZXJ5Lm1vZGUEAAAAAgAZcm1xLmptcy5tZXNzYWdlLnRpbWVzdGFtcAUAAAFrN8Bx3gAY\n" +
                "cm1xLmptcy5tZXNzYWdlLnByaW9yaXR5BAAAAAQAGnJtcS5qbXMubWVzc2FnZS5leHBpcmF0aW9uBQAAAAAAAAAAABJybXEuam1zLm1lc3NhZ2UuaWQIACdJ\n" +
                "RDphZWFmZmI2OS0zZjVhLTRlZTAtOTIwMC1jY2I0OWE2YzRiZjEAAAAAdxoAAAAAFUhpLCBJIGFtIHRleHQgbWVzc2FnZQ==";

        String decoded = new String(Base64.getMimeDecoder().decode(message.getBytes()));
        System.out.println(decoded);

    }
}
