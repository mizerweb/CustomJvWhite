package defpackage;

import android.content.Context;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class np2 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(int i, lq4 lq4Var, int i2) {
        super(3, lq4Var);
        this.e = i2;
        switch (i2) {
            case 4:
                super(i, lq4Var);
                break;
            default:
                this.f = i;
                break;
        }
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                np2 np2Var = new np2((op2) this.h, (lq4) obj3, 0);
                np2Var.g = (Throwable) obj2;
                return np2Var.invokeSuspend(sbiVar);
            case 1:
                np2 np2Var2 = new np2((ar2) this.h, (lq4) obj3, 1);
                np2Var2.g = (Throwable) obj2;
                return np2Var2.invokeSuspend(sbiVar);
            case 2:
                np2 np2Var3 = new np2((zt6) this.h, (lq4) obj3, 2);
                np2Var3.g = (Throwable) obj2;
                return np2Var3.invokeSuspend(sbiVar);
            case 3:
                np2 np2Var4 = new np2(this.f, (lq4) obj3, 3);
                np2Var4.g = (q0g) obj;
                np2Var4.h = (kbc) obj2;
                np2Var4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                np2 np2Var5 = new np2(3, (lq4) obj3, 4);
                np2Var5.g = (yx6) obj;
                np2Var5.h = (i0e) obj2;
                return np2Var5.invokeSuspend(sbiVar);
            case 5:
                Context context = (Context) this.h;
                np2 np2Var6 = new np2(this.f, (lq4) obj3, context);
                np2Var6.g = (ImageView) obj;
                np2Var6.invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                return new np2((AtomicReference) this.g, (zgi) this.h, (lq4) obj3).invokeSuspend(sbiVar);
            default:
                np2 np2Var7 = new np2((UploadFileAttachWorker) this.h, (lq4) obj3, 7);
                np2Var7.g = (Throwable) obj2;
                return np2Var7.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (ru.ok.tamtam.upload.workers.UploadFileAttachWorker.o(r1, r8) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (r9.u(r0, r8) == r4) goto L35;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(int i, lq4 lq4Var, Context context) {
        super(3, lq4Var);
        this.e = 5;
        this.h = context;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np2(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(AtomicReference atomicReference, zgi zgiVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 6;
        this.g = atomicReference;
        this.h = zgiVar;
    }
}
