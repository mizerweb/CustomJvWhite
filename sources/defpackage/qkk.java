package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qkk extends Binder implements IInterface {
    public final /* synthetic */ int c;

    public qkk(String str, int i) {
        this.c = i;
        switch (i) {
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    public abstract boolean k0(int i, Parcel parcel, Parcel parcel2);

    public boolean l0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean m0(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact = false;
        switch (this.c) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return k0(i, parcel, parcel2);
            case 1:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                h1m h1mVar = (h1m) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = otk.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(zo5.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    sbm sbmVar = h1mVar.f.a;
                    qjh qjhVar = h1mVar.e;
                    sbmVar.d(qjhVar);
                    h1mVar.d.c("onRequestInfo", new Object[0]);
                    if (bundle.getInt("error.code", -2) != 0) {
                        qjhVar.c(new InstallException(bundle.getInt("error.code", -2)));
                    } else {
                        i3m i3mVar = h1mVar.g;
                        bundle.getInt("version.code", -1);
                        int i4 = bundle.getInt("update.availability");
                        bundle.getInt("install.status", 0);
                        if (bundle.getInt("client.version.staleness", -1) != -1) {
                            bundle.getInt("client.version.staleness");
                        }
                        bundle.getInt("in.app.update.priority", 0);
                        bundle.getLong("bytes.downloaded");
                        bundle.getLong("total.bytes.to.download");
                        bundle.getLong("additional.size.required");
                        r6m r6mVar = i3mVar.d;
                        r6mVar.getClass();
                        r6m.a(new File(r6mVar.a.getFilesDir(), "assetpacks"));
                        HashMap map = new HashMap();
                        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                        HashSet hashSet = new HashSet();
                        if (integerArrayList != null) {
                            hashSet.addAll(integerArrayList);
                        }
                        map.put("blocking.destructive.intent", hashSet);
                        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                        HashSet hashSet2 = new HashSet();
                        if (integerArrayList2 != null) {
                            hashSet2.addAll(integerArrayList2);
                        }
                        map.put("nonblocking.destructive.intent", hashSet2);
                        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                        HashSet hashSet3 = new HashSet();
                        if (integerArrayList3 != null) {
                            hashSet3.addAll(integerArrayList3);
                        }
                        map.put("blocking.intent", hashSet3);
                        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                        HashSet hashSet4 = new HashSet();
                        if (integerArrayList4 != null) {
                            hashSet4.addAll(integerArrayList4);
                        }
                        map.put("nonblocking.intent", hashSet4);
                        qjhVar.d(new eu(i4));
                    }
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i5 = otk.a;
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(zo5.h(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    h1mVar.f.a.d(h1mVar.e);
                    h1mVar.d.c("onCompleteUpdate", new Object[0]);
                }
                return true;
            case 2:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                fcl fclVar = (fcl) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i6 = ptk.a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(zo5.h(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                t6m t6mVar = fclVar.f.a;
                if (t6mVar != null) {
                    qjh qjhVar2 = fclVar.e;
                    synchronized (t6mVar.f) {
                        t6mVar.e.remove(qjhVar2);
                        break;
                    }
                    t6mVar.a().post(new jul(0, t6mVar));
                }
                fclVar.d.a("onGetLaunchReviewFlowInfo", new Object[0]);
                fclVar.e.d(new hmk((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return l0(i, parcel, parcel2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return l0(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return m0(i, parcel, parcel2);
        }
    }

    public /* synthetic */ qkk(int i) {
        this.c = i;
    }
}
