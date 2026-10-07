package ru.ok.android.onelog;

import defpackage.no;
import java.util.Iterator;
import java.util.ServiceLoader;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class OneLogConfig {

    public interface Delegate {
        void attachApiClient(String str, Provider<no> provider);

        default void setMaxUploadFileSize(long j) {
        }
    }

    private OneLogConfig() {
    }

    public static void attachApiClient(String str, Provider<no> provider) {
        Iterator it = ServiceLoader.load(Delegate.class, Delegate.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            ((Delegate) it.next()).attachApiClient(str, provider);
        }
    }

    public static void setMaxUploadFileSize(long j) {
        Iterator it = ServiceLoader.load(Delegate.class, Delegate.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            ((Delegate) it.next()).setMaxUploadFileSize(j);
        }
    }
}
