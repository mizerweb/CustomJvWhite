package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jye extends fp8 {
    @Override // defpackage.fp8
    public ap8 dequeueWork() {
        try {
            yo8 yo8Var = this.mJobImpl;
            if (yo8Var != null) {
                return yo8Var.b();
            }
            synchronized (this.mCompatQueue) {
                try {
                    if (this.mCompatQueue.size() <= 0) {
                        return null;
                    }
                    return this.mCompatQueue.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.fp8, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new cp8(this);
    }
}
