If you want connect your java application to SharePoint through web services this project is what you are looking for.
API of the library is similar like Sharepoint API. It means that you do not have to know nothing about Sharepoint web services and NTLM authentication. You can create objects like SPsite, SPWeb, SPList, etc. and you can browse Sharepoint through these SPobjects.

# Downloads #
  * [java-sharepoint-2.0-BETA4.jar](https://docs.google.com/file/d/0B9L8v-5kz3b5azR4ZWJobGdubHM/edit?usp=sharing)

# Project features #
  * NTLM v2 authentication support
  * HTTP proxy support
  * API similar like Sharepoint API (SPObjects)

# Project dependencies #
  * commons-lang3-3.1.jar
  * commons-httpclient-3.1.jar
  * commons-codec-1.4.jar
  * commons-logging-1.1.1.jar
  * Java 1.7

# API example #
```
// Create NTLM v2 credentials (authenticator)
NtlmAuthenticator credentials = new NtlmAuthenticator("DOMAIN", "username", "password");
// Initialize proxy settings
HttpProxy httpProxy = new HttpProxy("myProxyServer.com", 8888);
// Connect to Sharepoint
SPSite instance = new SPSite(new URL("https://www.server.com/"), credentials, httpProxy, true, SPVersion.SP2013);
// Get root web instance
SPWeb rootWeb = instance.getRootWeb();
// Get list of all lists and document libraries from root web
List<SPList> lists = rootWeb.getLists();

...

// Save file stored in sharepoint document library to the local disk
File file = new File("/myLocalPath/filename.ext");
item.getFile().saveBinary(file);

...
```