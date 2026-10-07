package org.apache.commons.logging.impl;

import defpackage.qt4;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    private String diagnosticPrefix;
    private String logClassName;
    private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    private static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean useTCCL = true;
    protected Hashtable attributes = new Hashtable();
    protected Hashtable instances = new Hashtable();
    protected Constructor logConstructor = null;
    protected Class[] logConstructorSignature = {String.class};
    protected Method logMethod = null;
    protected Class[] logMethodSignature = {LogFactory.class};

    public LogFactoryImpl() {
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x016e A[LOOP:0: B:6:0x0034->B:47:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0166 A[SYNTHETIC] */
    private Log createLogFromClass(String str, String str2, boolean z) throws LogConfigurationException {
        Log log;
        Class<?> cls;
        URL systemResource;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Attempting to instantiate '" + str + "'");
        }
        Object[] objArr = {str2};
        ClassLoader baseClassLoader = getBaseClassLoader();
        Constructor<?> constructor = null;
        Class<?> cls2 = null;
        while (true) {
            StringBuilder sbV = qt4.v("Trying to load '", str, "' from classloader ");
            sbV.append(LogFactory.objectId(baseClassLoader));
            logDiagnostic(sbV.toString());
            try {
                try {
                    if (isDiagnosticsEnabled()) {
                        String str3 = str.replace('.', '/') + ".class";
                        if (baseClassLoader != null) {
                            systemResource = baseClassLoader.getResource(str3);
                        } else {
                            systemResource = ClassLoader.getSystemResource(str3 + ".class");
                        }
                        if (systemResource == null) {
                            logDiagnostic("Class '" + str + "' [" + str3 + "] cannot be found.");
                        } else {
                            logDiagnostic("Class '" + str + "' was found at '" + systemResource + "'");
                        }
                    }
                    try {
                        cls = Class.forName(str, true, baseClassLoader);
                    } catch (ClassNotFoundException e) {
                        logDiagnostic("The log adapter '" + str + "' is not available via classloader " + LogFactory.objectId(baseClassLoader) + ": " + ("" + e.getMessage()).trim());
                        try {
                            cls = Class.forName(str);
                        } catch (ClassNotFoundException e2) {
                            logDiagnostic("The log adapter '" + str + "' is not available via the LogFactoryImpl class classloader: " + ("" + e2.getMessage()).trim());
                        }
                    }
                    Class<?> cls3 = cls;
                    constructor = cls3.getConstructor(this.logConstructorSignature);
                    Object objNewInstance = constructor.newInstance(objArr);
                    if (objNewInstance instanceof Log) {
                        try {
                            log = (Log) objNewInstance;
                            cls2 = cls3;
                            break;
                        } catch (ExceptionInInitializerError e3) {
                            e = e3;
                            cls2 = cls3;
                            String str4 = "" + e.getMessage();
                            StringBuilder sbV2 = qt4.v("The log adapter '", str, "' is unable to initialize itself when loaded via classloader ");
                            sbV2.append(LogFactory.objectId(baseClassLoader));
                            sbV2.append(": ");
                            sbV2.append(str4.trim());
                            logDiagnostic(sbV2.toString());
                            log = null;
                            break;
                        } catch (NoClassDefFoundError e4) {
                            e = e4;
                            cls2 = cls3;
                            String str5 = "" + e.getMessage();
                            StringBuilder sbV3 = qt4.v("The log adapter '", str, "' is missing dependencies when loaded via classloader ");
                            sbV3.append(LogFactory.objectId(baseClassLoader));
                            sbV3.append(": ");
                            sbV3.append(str5.trim());
                            logDiagnostic(sbV3.toString());
                            log = null;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            cls2 = cls3;
                            handleFlawedDiscovery(str, baseClassLoader, th);
                            if (baseClassLoader == null) {
                                log = null;
                                break;
                            }
                            baseClassLoader = baseClassLoader.getParent();
                        }
                    } else {
                        handleFlawedHierarchy(baseClassLoader, cls3);
                        if (baseClassLoader == null) {
                            log = null;
                            break;
                        }
                        baseClassLoader = baseClassLoader.getParent();
                    }
                } catch (ExceptionInInitializerError e5) {
                    e = e5;
                } catch (NoClassDefFoundError e6) {
                    e = e6;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (LogConfigurationException e7) {
                throw e7;
            }
        }
        if (log != null && z) {
            this.logClassName = str;
            this.logConstructor = constructor;
            try {
                this.logMethod = cls2.getMethod("setLogFactory", this.logMethodSignature);
                logDiagnostic("Found method setLogFactory(LogFactory) in '" + str + "'");
            } catch (Throwable unused) {
                this.logMethod = null;
                StringBuilder sbV4 = qt4.v("[INFO] '", str, "' from classloader ");
                sbV4.append(LogFactory.objectId(baseClassLoader));
                sbV4.append(" does not declare optional method setLogFactory(LogFactory)");
                logDiagnostic(sbV4.toString());
            }
            StringBuilder sbV5 = qt4.v("Log adapter '", str, "' from classloader ");
            sbV5.append(LogFactory.objectId(cls2.getClassLoader()));
            sbV5.append(" has been selected for use.");
            logDiagnostic(sbV5.toString());
        }
        return log;
    }

    private Log discoverLogImplementation(String str) throws LogConfigurationException {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        initConfiguration();
        String strFindUserSpecifiedLogClassName = findUserSpecifiedLogClassName();
        if (strFindUserSpecifiedLogClassName == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
            }
            Log logCreateLogFromClass = null;
            int i = 0;
            while (true) {
                String[] strArr = classesToDiscover;
                if (i >= strArr.length || logCreateLogFromClass != null) {
                    break;
                }
                logCreateLogFromClass = createLogFromClass(strArr[i], str, true);
                i++;
            }
            if (logCreateLogFromClass != null) {
                return logCreateLogFromClass;
            }
            throw new LogConfigurationException("No suitable Log implementation");
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Attempting to load user-specified log class '" + strFindUserSpecifiedLogClassName + "'...");
        }
        Log logCreateLogFromClass2 = createLogFromClass(strFindUserSpecifiedLogClassName, str, true);
        if (logCreateLogFromClass2 != null) {
            return logCreateLogFromClass2;
        }
        StringBuffer stringBuffer = new StringBuffer("User-specified log class '");
        stringBuffer.append(strFindUserSpecifiedLogClassName);
        stringBuffer.append("' cannot be found or is not useable.");
        informUponSimilarName(stringBuffer, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LOG4J_LOGGER);
        informUponSimilarName(stringBuffer, strFindUserSpecifiedLogClassName, LOGGING_IMPL_JDK14_LOGGER);
        informUponSimilarName(stringBuffer, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LUMBERJACK_LOGGER);
        informUponSimilarName(stringBuffer, strFindUserSpecifiedLogClassName, LOGGING_IMPL_SIMPLE_LOGGER);
        throw new LogConfigurationException(stringBuffer.toString());
    }

    private String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String property = (String) getAttribute(LOG_PROPERTY);
        if (property == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            property = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (property == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                property = System.getProperty(LOG_PROPERTY);
            } catch (SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("No access allowed to system property 'org.apache.commons.logging.Log' - " + e.getMessage());
                }
            }
        }
        if (property == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                property = System.getProperty(LOG_PROPERTY_OLD);
            } catch (SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("No access allowed to system property 'org.apache.commons.logging.log' - " + e2.getMessage());
                }
            }
        }
        return property != null ? property.trim() : property;
    }

    private ClassLoader getBaseClassLoader() throws LogConfigurationException {
        ClassLoader classLoader = getClassLoader(LogFactoryImpl.class);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoader = getContextClassLoader();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoader, classLoader);
        if (lowestClassLoader == null) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoader;
        }
        if (lowestClassLoader != contextClassLoader) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                return lowestClassLoader;
            }
        }
        return lowestClassLoader;
    }

    private boolean getBooleanConfiguration(String str, boolean z) {
        String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z : Boolean.valueOf(configurationValue).booleanValue();
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    private String getConfigurationValue(String str) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[ENV] Trying to get configuration for item " + str);
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] Found LogFactory attribute [" + attribute + "] for " + str);
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[ENV] No LogFactory attribute found for " + str);
        }
        try {
            String property = System.getProperty(str);
            if (property != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ENV] Found system property [" + property + "] for " + str);
                }
                return property;
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] No system property found for property " + str);
            }
            if (!isDiagnosticsEnabled()) {
                return null;
            }
            logDiagnostic("[ENV] No configuration defined for item " + str);
            return null;
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[ENV] Security prevented reading system property " + str);
            }
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    private ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 != null) {
            for (ClassLoader parent = classLoader; parent != null; parent = parent.getParent()) {
                if (parent != classLoader2) {
                }
            }
            for (ClassLoader parent2 = classLoader2; parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == classLoader) {
                    return classLoader2;
                }
            }
            return null;
        }
        return classLoader;
    }

    private void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th) {
        if (isDiagnosticsEnabled()) {
            StringBuilder sbV = qt4.v("Could not instantiate Log '", str, "' -- ");
            sbV.append(th.getClass().getName());
            sbV.append(": ");
            sbV.append(th.getLocalizedMessage());
            logDiagnostic(sbV.toString());
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th);
        }
    }

    private void handleFlawedHierarchy(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        String name = Log.class.getName();
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (name.equals(cls2.getName())) {
                if (isDiagnosticsEnabled()) {
                    try {
                        logDiagnostic("Class '" + cls.getName() + "' was found in classloader " + LogFactory.objectId(classLoader) + ". It is bound to a Log interface which is not the one loaded from classloader " + LogFactory.objectId(getClassLoader(Log.class)));
                    } catch (Throwable unused) {
                        logDiagnostic("Error while trying to output diagnostics about bad class '" + cls + "'");
                    }
                }
                if (!this.allowFlawedHierarchy) {
                    StringBuffer stringBuffer = new StringBuffer("Terminating logging for this context due to bad log hierarchy. You have more than one version of '");
                    stringBuffer.append(Log.class.getName());
                    stringBuffer.append("' visible.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer.toString());
                    }
                    throw new LogConfigurationException(stringBuffer.toString());
                }
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer("Warning: bad log hierarchy. You have more than one version of '");
                    stringBuffer2.append(Log.class.getName());
                    stringBuffer2.append("' visible.");
                    logDiagnostic(stringBuffer2.toString());
                    return;
                }
                return;
            }
        }
        if (!this.allowFlawedDiscovery) {
            StringBuffer stringBuffer3 = new StringBuffer("Terminating logging for this context. Log class '");
            stringBuffer3.append(cls.getName());
            stringBuffer3.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer3.toString());
            }
            throw new LogConfigurationException(stringBuffer3.toString());
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer4 = new StringBuffer("[WARNING] Log class '");
            stringBuffer4.append(cls.getName());
            stringBuffer4.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer4.toString());
        }
    }

    private void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        String strObjectId;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                strObjectId = "UNKNOWN";
            }
        }
        this.diagnosticPrefix = "[LogFactoryImpl@" + System.identityHashCode(this) + " from " + strObjectId + "] ";
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Checking for '" + str + "'.");
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("Did not find '" + str + "'.");
                }
                return false;
            }
            if (!isDiagnosticsEnabled()) {
                return true;
            }
            logDiagnostic("Found '" + str + "'.");
            return true;
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Logging system '" + str + "' is available but not useable.");
            }
            return false;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public String[] getAttributeNames() {
        Vector vector = new Vector();
        Enumeration enumerationKeys = this.attributes.keys();
        while (enumerationKeys.hasMoreElements()) {
            vector.addElement((String) enumerationKeys.nextElement());
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        Log logNewInstance = newInstance(str);
        this.instances.put(str, logNewInstance);
        return logNewInstance;
    }

    public String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            LogFactory.logRawDiagnostic(this.diagnosticPrefix + str);
        }
    }

    public Log newInstance(String str) throws LogConfigurationException {
        try {
            Constructor constructor = this.logConstructor;
            Log logDiscoverLogImplementation = constructor == null ? discoverLogImplementation(str) : (Log) constructor.newInstance(str);
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(logDiscoverLogImplementation, this);
            }
            return logDiscoverLogImplementation;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                throw new LogConfigurationException(targetException);
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new LogConfigurationException(th);
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        Hashtable hashtable = this.attributes;
        if (obj == null) {
            hashtable.remove(str);
        } else {
            hashtable.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }
}
