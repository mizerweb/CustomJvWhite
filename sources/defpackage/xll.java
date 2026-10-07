package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class xll extends njh {
    public qjh d;

    @Override // defpackage.njh
    public final void a(fo foVar, qjh qjhVar) {
        this.d = qjhVar;
        p5l p5lVar = (p5l) ((jfl) foVar).p();
        ik7 ik7Var = new ik7(this);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = auk.a;
        parcelObtain.writeStrongBinder(ik7Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            p5lVar.c.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
