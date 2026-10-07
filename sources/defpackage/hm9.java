package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hm9 {
    public static final gm9 a;
    public static final gm9 b;

    static {
        gm9 gm9Var = null;
        try {
            gm9Var = (gm9) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = gm9Var;
        b = new gm9();
    }
}
