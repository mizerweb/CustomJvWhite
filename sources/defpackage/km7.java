package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class km7 extends z3 {
    public static final Parcelable.Creator<km7> CREATOR = new pkk(26);
    public static final Scope[] o = new Scope[0];
    public static final do6[] p = new do6[0];
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public do6[] i;
    public do6[] j;
    public final boolean k;
    public final int l;
    public boolean m;
    public final String n;

    public km7(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, do6[] do6VarArr, do6[] do6VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        do6[] do6VarArr3 = p;
        do6[] do6VarArr4 = do6VarArr == null ? do6VarArr3 : do6VarArr;
        do6VarArr3 = do6VarArr2 != null ? do6VarArr2 : do6VarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = i5.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface v6mVar = iInterfaceQueryLocalInterface instanceof s28 ? (s28) iInterfaceQueryLocalInterface : new v6m(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        v6m v6mVar2 = (v6m) v6mVar;
                        Parcel parcelV = v6mVar2.V(2, v6mVar2.l0());
                        Account account3 = (Account) buk.a(parcelV, Account.CREATOR);
                        parcelV.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.h = account2;
        this.f = scopeArr2;
        this.g = bundle2;
        this.i = do6VarArr4;
        this.j = do6VarArr3;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        pkk.a(this, parcel, i);
    }
}
