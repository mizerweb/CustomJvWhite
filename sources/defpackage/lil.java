package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lil implements Runnable {
    public final qjh a;

    public lil() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            qjh qjhVar = this.a;
            if (qjhVar != null) {
                qjhVar.c(e);
            }
        }
    }

    public lil(qjh qjhVar) {
        this.a = qjhVar;
    }
}
