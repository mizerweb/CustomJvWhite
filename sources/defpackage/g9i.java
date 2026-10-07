package defpackage;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class g9i implements kg7, rg4 {
    public final Object a;

    public /* synthetic */ g9i(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.kg7
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        ((Long) obj).getClass();
        tw5 tw5Var = (tw5) this.a;
        try {
            tw5Var.a();
        } catch (Throwable th) {
            ((CidLogger) tw5Var.b).logException("AudioMonitor", "Can't get recording configuration list", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(AppInfo appInfo, nq4 nq4Var) {
        wck wckVar;
        if (nq4Var instanceof wck) {
            wckVar = (wck) nq4Var;
            int i = wckVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wckVar.f = i - Integer.MIN_VALUE;
            } else {
                wckVar = new wck(this, nq4Var);
            }
        } else {
            wckVar = new wck(this, nq4Var);
        }
        Object obj = wckVar.d;
        int i2 = wckVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        phf phfVar = (phf) this.a;
        f4k f4kVar = new f4k((Context) phfVar.b, Collections.singletonList(appInfo), (Logger) phfVar.c);
        wckVar.f = 1;
        Object objH = f4kVar.h(wckVar);
        hu4 hu4Var = hu4.a;
        return objH == hu4Var ? hu4Var : objH;
    }

    public void c(r6a r6aVar) {
        d0c d0cVar = (d0c) this.a;
        d0cVar.a = r6aVar;
        Iterator it = ((LinkedList) d0cVar.c).iterator();
        while (it.hasNext()) {
            ((plk) it.next()).b();
        }
        ((LinkedList) d0cVar.c).clear();
        d0cVar.b = null;
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        tvj.i("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        ((i5b) this.a).e();
    }
}
