package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xfb {
    public static final wfb a;
    public static final wfb b;

    static {
        wfb wfbVar = null;
        try {
            wfbVar = (wfb) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = wfbVar;
        b = new wfb();
    }
}
