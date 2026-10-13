// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact( Document : String, TextToRedact : String, redactionChar : Char = 'X' ): String  {
    val redaction = Document.replace(TextToRedact, redactionChar.toString().repeat(TextToRedact.length))
    return redaction
}