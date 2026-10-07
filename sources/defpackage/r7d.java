package defpackage;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class r7d extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ FrameLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7d(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        FrameLayout frameLayout = (FrameLayout) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                r7d r7dVar = new r7d(i2, lq4Var, 0);
                r7dVar.f = frameLayout;
                r7dVar.invokeSuspend(sbiVar);
                break;
            case 1:
                r7d r7dVar2 = new r7d(i2, lq4Var, 1);
                r7dVar2.f = frameLayout;
                r7dVar2.invokeSuspend(sbiVar);
                break;
            case 2:
                r7d r7dVar3 = new r7d(i2, lq4Var, 2);
                r7dVar3.f = frameLayout;
                r7dVar3.invokeSuspend(sbiVar);
                break;
            default:
                r7d r7dVar4 = new r7d(i2, lq4Var, i2);
                r7dVar4.f = frameLayout;
                r7dVar4.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        FrameLayout frameLayout = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                frameLayout.setBackgroundColor(a8gVar.h(frameLayout).b().b);
                break;
            case 1:
                ch3.d0(obj);
                frameLayout.setBackgroundColor(a8gVar.h(frameLayout).k().b);
                break;
            case 2:
                ch3.d0(obj);
                frameLayout.setBackgroundColor(a8gVar.h(frameLayout).b().c);
                break;
            default:
                ch3.d0(obj);
                frameLayout.setBackgroundColor(a8gVar.h(frameLayout).b().c);
                break;
        }
        return sbiVar;
    }
}
