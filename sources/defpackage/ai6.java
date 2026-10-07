package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ai6 {
    public static final zh6 a = new zh6();
    public static final zh6 b;

    static {
        zh6 zh6Var = null;
        try {
            zh6Var = (zh6) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = zh6Var;
    }
}
