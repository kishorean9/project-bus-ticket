package io.curity.identityserver.plugin.project

import se.curity.identityserver.sdk.plugin.descriptor.ConsentorPluginDescriptor

class projectConsentorDescriptor: ConsentorPluginDescriptor<projectConsentorConfig>
{
    override fun getConsentorType() = projectConsentor::class.java

    override fun getPluginImplementationType() = "project"

    override fun getConfigurationType() = projectConsentorConfig::class.java
}
