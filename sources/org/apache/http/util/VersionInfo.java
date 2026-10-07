package org.apache.http.util;

import defpackage.ore;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            ore.p("Package identifier must not be null.");
            throw null;
        }
        this.infoPackage = str;
        this.infoModule = str2 == null ? UNAVAILABLE : str2;
        this.infoRelease = str3 == null ? UNAVAILABLE : str3;
        this.infoTimestamp = str4 == null ? UNAVAILABLE : str4;
        this.infoClassloader = str5 == null ? UNAVAILABLE : str5;
    }

    public static final VersionInfo fromMap(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str == null) {
            ore.p("Package identifier must not be null.");
            return null;
        }
        if (map != null) {
            String str5 = (String) map.get(PROPERTY_MODULE);
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get(PROPERTY_RELEASE);
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get(PROPERTY_TIMESTAMP);
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new VersionInfo(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static final VersionInfo loadVersionInfo(String str, ClassLoader classLoader) {
        Properties properties;
        if (str == null) {
            ore.p("Package identifier must not be null.");
            return null;
        }
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/version.properties");
            if (resourceAsStream != null) {
                try {
                    properties = new Properties();
                    properties.load(resourceAsStream);
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    resourceAsStream.close();
                    throw th;
                }
            } else {
                properties = null;
            }
        } catch (IOException unused2) {
            properties = null;
        }
        if (properties != null) {
            return fromMap(str, properties, classLoader);
        }
        return null;
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.infoClassloader.length() + this.infoTimestamp.length() + this.infoRelease.length() + this.infoModule.length() + this.infoPackage.length() + 20);
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.infoPackage);
        stringBuffer.append(':');
        stringBuffer.append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoTimestamp);
        }
        stringBuffer.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            stringBuffer.append('@');
            stringBuffer.append(this.infoClassloader);
        }
        return stringBuffer.toString();
    }

    public static final VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                VersionInfo versionInfoLoadVersionInfo = loadVersionInfo(str, classLoader);
                if (versionInfoLoadVersionInfo != null) {
                    arrayList.add(versionInfoLoadVersionInfo);
                }
            }
            return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
        }
        ore.p("Package identifier list must not be null.");
        return null;
    }
}
