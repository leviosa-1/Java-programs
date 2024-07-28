Add-Type -TypeDefinition @"
using System;
using System.Speech.Synthesis;

public class Speaker
{
    public static void Main(string[] args)
    {
        SpeechSynthesizer synthesizer = new SpeechSynthesizer();
        synthesizer.Speak("$args");
    }
}
"@

[Speaker]::Main("$args")
