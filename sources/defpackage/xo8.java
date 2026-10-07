package defpackage;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes4.dex */
public final class xo8 extends AsyncTask {
    public final /* synthetic */ fp8 a;

    public xo8(fp8 fp8Var) {
        this.a = fp8Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            fp8 fp8Var = this.a;
            ap8 ap8VarDequeueWork = fp8Var.dequeueWork();
            if (ap8VarDequeueWork == null) {
                return null;
            }
            fp8Var.onHandleWork(ap8VarDequeueWork.getIntent());
            ap8VarDequeueWork.f();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.processorFinished();
    }
}
