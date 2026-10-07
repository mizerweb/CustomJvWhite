package defpackage;

import android.view.View;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class l2j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ VideoMessageWidget g;
    public final /* synthetic */ View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2j(VideoMessageWidget videoMessageWidget, View view, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = videoMessageWidget;
        this.h = view;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        View view = this.h;
        VideoMessageWidget videoMessageWidget = this.g;
        switch (i) {
            case 0:
                return new l2j(videoMessageWidget, view, lq4Var, 0);
            default:
                return new l2j(videoMessageWidget, view, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((l2j) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a0, code lost:
    
        if (r0 == r7) goto L97;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
