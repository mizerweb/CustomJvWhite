package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class qt1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt1(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new qt1((CallOpponentsListWidget) this.g, (fu1) obj2, lq4Var, 0);
            case 1:
                qt1 qt1Var = new qt1((pu1) obj2, lq4Var, 1);
                qt1Var.g = obj;
                return qt1Var;
            case 2:
                return new qt1((nv1) this.g, (hv1) obj2, lq4Var, 2);
            case 3:
                qt1 qt1Var2 = new qt1((CallScreen) obj2, lq4Var, 3);
                qt1Var2.g = obj;
                return qt1Var2;
            case 4:
                return new qt1((h02) this.g, (CharSequence) obj2, lq4Var, 4);
            case 5:
                return new qt1((vo8) this.g, (cf7) obj2, lq4Var, 5);
            case 6:
                return new qt1((a22) this.g, (g4b) obj2, lq4Var, 6);
            case 7:
                qt1 qt1Var3 = new qt1((w82) obj2, lq4Var, 7);
                qt1Var3.g = obj;
                return qt1Var3;
            case 8:
                return new qt1((ny8) this.g, (z82) obj2, lq4Var, 8);
            case 9:
                return new qt1((z82) this.g, (so4) obj2, lq4Var, 9);
            case 10:
                return new qt1((z82) this.g, (wo3) obj2, lq4Var, 10);
            case 11:
                return new qt1((z82) this.g, (o29) obj2, lq4Var, 11);
            case 12:
                return new qt1((z82) this.g, (yq0) obj2, lq4Var, 12);
            case 13:
                return new qt1((d92) this.g, (if1) obj2, lq4Var, 13);
            case 14:
                return new qt1((d92) this.g, (yq0) obj2, lq4Var, 14);
            case 15:
                qt1 qt1Var4 = new qt1((ljf) obj2, lq4Var, 15);
                qt1Var4.g = obj;
                return qt1Var4;
            case 16:
                qt1 qt1Var5 = new qt1((sb2) obj2, lq4Var, 16);
                qt1Var5.g = obj;
                return qt1Var5;
            case 17:
                qt1 qt1Var6 = new qt1((dc2) obj2, lq4Var, 17);
                qt1Var6.g = obj;
                return qt1Var6;
            case 18:
                qt1 qt1Var7 = new qt1((uj2) obj2, lq4Var, 18);
                qt1Var7.g = obj;
                return qt1Var7;
            case 19:
                return new qt1((woe) this.g, (pm2) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new qt1((List) this.g, (rm2) obj2, lq4Var, 20);
            case 21:
                return new qt1((un2) this.g, (Activity) obj2, lq4Var, 21);
            case 22:
                qt1 qt1Var8 = new qt1((qr2) obj2, lq4Var, 22);
                qt1Var8.g = obj;
                return qt1Var8;
            case 23:
                qt1 qt1Var9 = new qt1((lv2) obj2, lq4Var, 23);
                qt1Var9.g = obj;
                return qt1Var9;
            case 24:
                return new qt1((hy2) obj2, lq4Var, 24);
            case 25:
                return new qt1((hz2) this.g, (gz2) obj2, lq4Var, 25);
            case 26:
                return new qt1((qw2) this.g, (ArrayList) obj2, lq4Var, 26);
            case 27:
                return new qt1((k13) this.g, (yhh) obj2, lq4Var, 27);
            case 28:
                return new qt1((k13) this.g, (l13) obj2, lq4Var, 28);
            default:
                return new qt1((n23) this.g, (wy2) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qt1) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qt1) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((qt1) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((qt1) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((qt1) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((qt1) create((d3b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qt1) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qt1) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qt1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:386:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:388:0x07da  */
    /* JADX WARN: Code duplicated, block: B:390:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:393:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:395:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:398:0x081a  */
    /* JADX WARN: Code duplicated, block: B:400:0x081e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:389:0x07e4 -> B:391:0x07e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 2214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt1(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
