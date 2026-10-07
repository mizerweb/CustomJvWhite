package defpackage;

import android.os.Parcel;
import com.vk.push.common.Logger;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n6k implements ptb, whe {
    public final Object a;

    public n6k(wze wzeVar, ac5 ac5Var) {
        this.a = Logger.DefaultImpls.createLogger(ac5Var, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, nq4 nq4Var) {
        sik sikVar;
        if (nq4Var instanceof sik) {
            sikVar = (sik) nq4Var;
            int i = sikVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sikVar.f = i - Integer.MIN_VALUE;
            } else {
                sikVar = new sik(this, nq4Var);
            }
        } else {
            sikVar = new sik(this, nq4Var);
        }
        Object obj = sikVar.d;
        int i2 = sikVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        hik hikVar = (hik) this.a;
        sikVar.f = 1;
        Object objB = hikVar.b(str, sikVar);
        hu4 hu4Var = hu4.a;
        return objB == hu4Var ? hu4Var : objB;
    }

    @Override // defpackage.whe
    public void accept(Object obj, Object obj2) {
        zlk zlkVar = new zlk((qjh) obj2, 1);
        llk llkVar = (llk) ((emk) obj).p();
        hp hpVar = (hp) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(llkVar.e);
        int i = ykk.a;
        parcelObtain.writeStrongBinder(zlkVar);
        ykk.c(parcelObtain, hpVar);
        parcelObtain.writeStrongBinder(null);
        llkVar.G(2, parcelObtain);
    }

    public Mac b() {
        try {
            return Mac.getInstance((String) this.a);
        } catch (NoSuchAlgorithmException e) {
            ore.l("defined mac algorithm was not found", e);
            return null;
        } catch (Exception e2) {
            ore.l("could not create mac instance in hkdf", e2);
            return null;
        }
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    public /* synthetic */ n6k(Object obj) {
        this.a = obj;
    }
}
