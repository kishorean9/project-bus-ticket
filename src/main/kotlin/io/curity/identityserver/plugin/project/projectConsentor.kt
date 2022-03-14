package io.curity.identityserver.plugin.project

import se.curity.identityserver.sdk.attribute.ConsentAttributes
import se.curity.identityserver.sdk.oauth.consent.ConsentorResult
import se.curity.identityserver.sdk.oauth.consent.Consentor

class projectConsentor(private val _configuration: projectConsentorConfig): Consentor
{
    // See examples of consentors on GitHub: https://github.com/search?q=topic%3Aconsentor+org%3Acurityio

    override fun apply(consentAttributes: ConsentAttributes,transactionId: String): ConsentorResult
    {
        TODO()
    }
}
