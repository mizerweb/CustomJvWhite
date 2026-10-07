package org.apache.commons.logging;

import defpackage.c0a;
import defpackage.nbh;
import defpackage.qt4;
import defpackage.zo5;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.commons.logging.impl.Jdk14Logger;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    private static String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories;
    protected static LogFactory nullClassLoaderFactory;
    private static ClassLoader thisClassLoader = getClassLoader(LogFactory.class);

    static {
        initDiagnostics();
        logClassLoaderEnvironment(LogFactory.class);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    public static Object createFactory(String str, ClassLoader classLoader) {
        Class<?> clsLoadClass = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        clsLoadClass = classLoader.loadClass(str);
                        if (LogFactory.class.isAssignableFrom(clsLoadClass)) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic("Loaded class " + clsLoadClass.getName() + " from classloader " + objectId(classLoader));
                            }
                        } else if (isDiagnosticsEnabled()) {
                            logDiagnostic("Factory class " + clsLoadClass.getName() + " loaded from classloader " + objectId(clsLoadClass.getClassLoader()) + " does not extend '" + LogFactory.class.getName() + "' as loaded by this classloader.");
                            logHierarchy("[BAD CL TREE] ", classLoader);
                        }
                        return (LogFactory) clsLoadClass.newInstance();
                    } catch (ClassCastException unused) {
                        if (classLoader == thisClassLoader) {
                            boolean zImplementsLogFactory = implementsLogFactory(clsLoadClass);
                            String str2 = "The application has specified that a custom LogFactory implementation should be used but Class '" + str + "' cannot be converted to '" + LogFactory.class.getName() + "'. ";
                            String strConcat = (zImplementsLogFactory ? str2.concat("The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://jakarta.apache.org/commons/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. ") : str2.concat("Please check the custom implementation. ")).concat("Help can be found @http://jakarta.apache.org/commons/logging/troubleshooting.html.");
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(strConcat);
                            }
                            throw new ClassCastException(strConcat);
                        }
                    } catch (NoClassDefFoundError e) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic("Class '" + str + "' cannot be loaded via classloader " + objectId(classLoader) + " - it depends on some other class that cannot be found.");
                            }
                            throw e;
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    if (classLoader == thisClassLoader) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic("Unable to locate any class called '" + str + "' via classloader " + objectId(classLoader));
                        }
                        throw e2;
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to load factory class via classloader " + objectId(classLoader) + " - trying the classloader associated with this LogFactory.");
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            return (clsLoadClass == null || LogFactory.class.isAssignableFrom(clsLoadClass)) ? new LogConfigurationException(e3) : new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
        }
    }

    private static final Hashtable createFactoryStore() {
        Hashtable hashtable;
        String property = System.getProperty(HASHTABLE_IMPLEMENTATION_PROPERTY);
        if (property == null) {
            property = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(property).newInstance();
        } catch (Throwable unused) {
            if (!WEAK_HASHTABLE_CLASSNAME.equals(property)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
            hashtable = null;
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            try {
                return (ClassLoader) Thread.class.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
            } catch (IllegalAccessException e) {
                throw new LogConfigurationException("Unexpected IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getTargetException() instanceof SecurityException) {
                    return null;
                }
                throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
            }
        } catch (NoSuchMethodException unused) {
            return getClassLoader(LogFactory.class);
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        return classLoader == null ? nullClassLoaderFactory : (LogFactory) factories.get(classLoader);
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to get classloader for class '" + cls + "' due to security restrictions - " + e.getMessage());
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00e9, please report this as an issue */
    private static final Properties getConfigurationFile(ClassLoader classLoader, String str) {
        URL url;
        Properties properties = null;
        try {
            Enumeration resources = getResources(classLoader, str);
            if (resources == null) {
                return null;
            }
            url = null;
            double d = 0.0d;
            while (resources.hasMoreElements()) {
                try {
                    URL url2 = (URL) resources.nextElement();
                    Properties properties2 = getProperties(url2);
                    if (properties2 != null) {
                        if (properties == null) {
                            try {
                                String property = properties2.getProperty(PRIORITY_KEY);
                                d = property != null ? Double.parseDouble(property) : 0.0d;
                                if (isDiagnosticsEnabled()) {
                                    logDiagnostic("[LOOKUP] Properties file found at '" + url2 + "' with priority " + d);
                                }
                                url = url2;
                                properties = properties2;
                            } catch (SecurityException unused) {
                                url = url2;
                                properties = properties2;
                                if (isDiagnosticsEnabled()) {
                                    logDiagnostic("SecurityException thrown while trying to find/read config files.");
                                }
                                if (isDiagnosticsEnabled()) {
                                    if (properties == null) {
                                        logDiagnostic(c0a.o("[LOOKUP] No properties file of name '", str, "' found."));
                                    } else {
                                        logDiagnostic("[LOOKUP] Properties file of name '" + str + "' found at '" + url + '\"');
                                    }
                                }
                                return properties;
                            }
                        } else {
                            String property2 = properties2.getProperty(PRIORITY_KEY);
                            double d2 = property2 != null ? Double.parseDouble(property2) : 0.0d;
                            if (d2 > d) {
                                if (isDiagnosticsEnabled()) {
                                    logDiagnostic("[LOOKUP] Properties file at '" + url2 + "' with priority " + d2 + " overrides file at '" + url + "' with priority " + d);
                                }
                                url = url2;
                                properties = properties2;
                                d = d2;
                            } else if (isDiagnosticsEnabled()) {
                                logDiagnostic("[LOOKUP] Properties file at '" + url2 + "' with priority " + d2 + " does not override file at '" + url + "' with priority " + d);
                            }
                        }
                    }
                } catch (SecurityException unused2) {
                }
            }
            if (isDiagnosticsEnabled()) {
                if (properties == null) {
                    logDiagnostic(c0a.o("[LOOKUP] No properties file of name '", str, "' found."));
                } else {
                    logDiagnostic("[LOOKUP] Properties file of name '" + str + "' found at '" + url + '\"');
                }
            }
            return properties;
        } catch (SecurityException unused3) {
            url = null;
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static LogFactory getFactory() throws LogConfigurationException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader contextClassLoader = getContextClassLoader();
        if (contextClassLoader == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory cachedFactory = getCachedFactory(contextClassLoader);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] LogFactory implementation requested for the first time for context classloader " + objectId(contextClassLoader));
            logHierarchy("[LOOKUP] ", contextClassLoader);
        }
        Properties configurationFile = getConfigurationFile(contextClassLoader, FACTORY_PROPERTIES);
        ClassLoader classLoader = (configurationFile == null || (property = configurationFile.getProperty(TCCL_KEY)) == null || Boolean.valueOf(property).booleanValue()) ? contextClassLoader : thisClassLoader;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String property2 = System.getProperty(FACTORY_PROPERTY);
            if (property2 != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Creating an instance of LogFactory class '" + property2 + "' as specified by system property org.apache.commons.logging.LogFactory");
                }
                cachedFactory = newFactory(property2, classLoader, contextClassLoader);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [" + e.getMessage().trim() + "]. Trying alternative implementations...");
            }
        } catch (RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [" + e2.getMessage().trim() + "] as specified by a system property.");
            }
            throw e2;
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream resourceAsStream = getResourceAsStream(contextClassLoader, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                    }
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && !"".equals(line)) {
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic("[LOOKUP]  Creating an instance of LogFactory class " + line + " as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader.");
                        }
                        cachedFactory = newFactory(line, classLoader, contextClassLoader);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [" + e3.getMessage().trim() + "]. Trying alternative implementations...");
                }
            }
        }
        if (cachedFactory == null) {
            if (configurationFile != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property3 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property3 != null) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(c0a.o("[LOOKUP] Properties file specifies LogFactory subclass '", property3, "'"));
                    }
                    cachedFactory = newFactory(property3, classLoader, contextClassLoader);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            cachedFactory = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoader);
        }
        if (cachedFactory != null) {
            cacheFactory(contextClassLoader, cachedFactory);
            if (configurationFile != null) {
                Enumeration<?> enumerationPropertyNames = configurationFile.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    cachedFactory.setAttribute(str, configurationFile.getProperty(str));
                }
            }
        }
        return cachedFactory;
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getLog(cls.getName());
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.5
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    InputStream inputStreamOpenStream = url.openStream();
                    if (inputStreamOpenStream == null) {
                        return null;
                    }
                    Properties properties = new Properties();
                    properties.load(inputStreamOpenStream);
                    inputStreamOpenStream.close();
                    return properties;
                } catch (IOException unused) {
                    if (!LogFactory.isDiagnosticsEnabled()) {
                        return null;
                    }
                    LogFactory.logDiagnostic("Unable to read URL " + url);
                    return null;
                }
            }
        });
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader2 = classLoader;
                String str2 = str;
                return classLoader2 != null ? classLoader2.getResourceAsStream(str2) : ClassLoader.getSystemResourceAsStream(str2);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.4
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    ClassLoader classLoader2 = classLoader;
                    return classLoader2 != null ? classLoader2.getResources(str) : ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic("Exception while trying to find configuration file " + str + ":" + e.getMessage());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static boolean implementsLogFactory(Class cls) {
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                    return false;
                }
                logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                boolean zIsAssignableFrom = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                if (zIsAssignableFrom) {
                    logDiagnostic("[CUSTOM LOG FACTORY] " + cls.getName() + " implements LogFactory but was loaded by an incompatible classloader.");
                    return zIsAssignableFrom;
                }
                logDiagnostic("[CUSTOM LOG FACTORY] " + cls.getName() + " does not implement LogFactory.");
                return zIsAssignableFrom;
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                logDiagnostic("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + e.getMessage());
            } catch (SecurityException e2) {
                logDiagnostic("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + e2.getMessage());
            }
        }
        return false;
    }

    private static void initDiagnostics() {
        String strObjectId;
        try {
            String property = System.getProperty(DIAGNOSTICS_DEST_PROPERTY);
            if (property == null) {
                return;
            }
            if (property.equals("STDOUT")) {
                diagnosticsStream = System.out;
            } else if (property.equals("STDERR")) {
                diagnosticsStream = System.err;
            } else {
                diagnosticsStream = new PrintStream(new FileOutputStream(property, true));
            }
            try {
                ClassLoader classLoader = thisClassLoader;
                strObjectId = classLoader == null ? "BOOTLOADER" : objectId(classLoader);
            } catch (SecurityException unused) {
                strObjectId = "UNKNOWN";
            }
            diagnosticPrefix = c0a.o("[LogFactory from ", strObjectId, "] ");
        } catch (IOException | SecurityException unused2) {
        }
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                logDiagnostic("[ENV] Extension directories (java.ext.dir): " + System.getProperty("java.ext.dir"));
                logDiagnostic("[ENV] Application classpath (java.class.path): " + System.getProperty("java.class.path"));
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuilder sbV = qt4.v("[ENV] Class ", name, " was loaded via classloader ");
                sbV.append(objectId(classLoader));
                logDiagnostic(sbV.toString());
                logHierarchy(c0a.o("[ENV] Ancestry of classloader which loaded ", name, " is "), classLoader);
            } catch (SecurityException unused2) {
                logDiagnostic("[ENV] Security forbids determining the classloader for ".concat(name));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String string = classLoader.toString();
                StringBuilder sbC = nbh.C(str);
                sbC.append(objectId(classLoader));
                sbC.append(" == '");
                sbC.append(string);
                sbC.append("'");
                logDiagnostic(sbC.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer = new StringBuffer(zo5.o(str, "ClassLoader tree:"));
                    do {
                        stringBuffer.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer.append("BOOT");
                    logDiagnostic(stringBuffer.toString());
                }
            } catch (SecurityException unused2) {
                logDiagnostic(zo5.o(str, "Security forbids determining the system classloader."));
            }
        }
    }

    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    public static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object objDoPrivileged = AccessController.doPrivileged((PrivilegedAction<Object>) new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (objDoPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) objDoPrivileged;
            if (!isDiagnosticsEnabled()) {
                throw logConfigurationException;
            }
            logDiagnostic("An error occurred while loading the factory class:" + logConfigurationException.getMessage());
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Created object " + objectId(objDoPrivileged) + " to manage classloader " + objectId(classLoader2));
        }
        return (LogFactory) objDoPrivileged;
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for classloader " + objectId(classLoader));
        }
        synchronized (factories) {
            try {
                if (classLoader == null) {
                    LogFactory logFactory = nullClassLoaderFactory;
                    if (logFactory != null) {
                        logFactory.release();
                        nullClassLoaderFactory = null;
                    }
                } else {
                    LogFactory logFactory2 = (LogFactory) factories.get(classLoader);
                    if (logFactory2 != null) {
                        logFactory2.release();
                        factories.remove(classLoader);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        synchronized (factories) {
            try {
                Enumeration enumerationElements = factories.elements();
                while (enumerationElements.hasMoreElements()) {
                    ((LogFactory) enumerationElements.nextElement()).release();
                }
                factories.clear();
                LogFactory logFactory = nullClassLoaderFactory;
                if (logFactory != null) {
                    logFactory.release();
                    nullClassLoaderFactory = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    public static Log getLog(String str) throws LogConfigurationException {
        return new Jdk14Logger(str);
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }
}
