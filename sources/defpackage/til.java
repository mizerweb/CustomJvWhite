package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes2.dex */
public final class til extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public til(ukk ukkVar, int i) {
        super(ukkVar);
        this.k = i;
        yab.t(ukkVar, "GoogleApiClient must not be null");
        yab.t(l51.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ voe b(Status status) {
        int i = this.k;
        return status;
    }

    public final void g(fo foVar) {
        switch (this.k) {
            case 0:
                q5l q5lVar = (q5l) foVar;
                nam namVar = (nam) q5lVar.p();
                csl cslVar = new csl(this, 0);
                GoogleSignInOptions googleSignInOptions = q5lVar.y;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(namVar.e);
                int i = o5l.a;
                parcelObtain.writeStrongBinder(cslVar);
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                namVar.m0(102, parcelObtain);
                break;
            default:
                q5l q5lVar2 = (q5l) foVar;
                nam namVar2 = (nam) q5lVar2.p();
                csl cslVar2 = new csl(this, 1);
                GoogleSignInOptions googleSignInOptions2 = q5lVar2.y;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(namVar2.e);
                int i2 = o5l.a;
                parcelObtain2.writeStrongBinder(cslVar2);
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                namVar2.m0(AidlException.HOST_IS_NOT_MASTER, parcelObtain2);
                break;
        }
    }

    public final void h(Status status) {
        yab.n("Failed result must not be success", !status.b());
        e(b(status));
    }
}
