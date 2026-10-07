package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class enk implements lnk {
    public static final Object c = new Object();
    public volatile lnk a;
    public volatile Object b;

    public static lnk a(lnk lnkVar) {
        if (lnkVar instanceof enk) {
            return lnkVar;
        }
        enk enkVar = new enk();
        enkVar.b = c;
        enkVar.a = lnkVar;
        return enkVar;
    }

    @Override // defpackage.lnk
    public final Object zza() {
        Object objZza;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.b;
                if (objZza == obj2) {
                    objZza = this.a.zza();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZza;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
