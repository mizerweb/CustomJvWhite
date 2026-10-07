package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q5l extends a {
    public final GoogleSignInOptions y;

    public q5l(Context context, Looper looper, s80 s80Var, GoogleSignInOptions googleSignInOptions, skk skkVar, skk skkVar2) {
        ukg ukgVar;
        super(context, looper, 91, s80Var, skkVar, skkVar2, 0);
        Set<Scope> set = (Set) s80Var.b;
        if (googleSignInOptions != null) {
            ukgVar = new ukg();
            ukgVar.d = new HashSet();
            ukgVar.h = new HashMap();
            ukgVar.d = new HashSet(googleSignInOptions.b);
            ukgVar.a = googleSignInOptions.e;
            ukgVar.b = googleSignInOptions.f;
            ukgVar.c = googleSignInOptions.d;
            ukgVar.e = googleSignInOptions.g;
            ukgVar.f = googleSignInOptions.c;
            ukgVar.g = googleSignInOptions.h;
            ukgVar.h = GoogleSignInOptions.c(googleSignInOptions.i);
            ukgVar.i = googleSignInOptions.j;
        } else {
            ukgVar = new ukg();
            ukgVar.d = new HashSet();
            ukgVar.h = new HashMap();
        }
        byte[] bArr = new byte[16];
        rqk.a.nextBytes(bArr);
        ukgVar.i = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) ukgVar.d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = (HashSet) ukgVar.d;
        if (hashSet2.contains(GoogleSignInOptions.n)) {
            Scope scope2 = GoogleSignInOptions.m;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (ukgVar.c && (((Account) ukgVar.f) == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.l);
        }
        this.y = new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) ukgVar.f, ukgVar.c, ukgVar.a, ukgVar.b, (String) ukgVar.e, (String) ukgVar.g, (HashMap) ukgVar.h, (String) ukgVar.i);
    }

    @Override // defpackage.fo
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof nam ? (nam) iInterfaceQueryLocalInterface : new nam(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 3);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
