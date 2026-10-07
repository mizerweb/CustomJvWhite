package defpackage;

import one.me.android.initialization.AccountInitializer;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class m5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new m5((q5) obj2, lq4Var, 0);
            case 1:
                return new m5((AccountInitializer) obj2, lq4Var, 1);
            case 2:
                return new m5((d9) obj2, lq4Var, 2);
            case 3:
                return new m5((qn) obj2, lq4Var, 3);
            case 4:
                return new m5((lv) obj2, lq4Var, 4);
            case 5:
                return new m5((p20) obj2, lq4Var, 5);
            case 6:
                return new m5((za0) obj2, lq4Var, 6);
            case 7:
                return new m5((vc0) obj2, lq4Var, 7);
            case 8:
                return new m5((jp0) obj2, lq4Var, 8);
            case 9:
                return new m5((l01) obj2, lq4Var, 9);
            case 10:
                return new m5((ya1) obj2, lq4Var, 10);
            case 11:
                return new m5((kl1) obj2, lq4Var, 11);
            case 12:
                return new m5((vl1) obj2, lq4Var, 12);
            case 13:
                return new m5((kt1) obj2, lq4Var, 13);
            case 14:
                return new m5((nv1) obj2, lq4Var, 14);
            case 15:
                return new m5((j52) obj2, lq4Var, 15);
            case 16:
                return new m5((w82) obj2, lq4Var, 16);
            case 17:
                return new m5((sb2) obj2, lq4Var, 17);
            case 18:
                return new m5((qc2) obj2, lq4Var, 18);
            case 19:
                return new m5((d0c) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new m5((lg) obj2, lq4Var, 20);
            case 21:
                return new m5((woe) obj2, lq4Var, 21);
            case 22:
                return new m5((ly2) obj2, lq4Var, 22);
            case 23:
                return new m5((s13) obj2, lq4Var, 23);
            case 24:
                return new m5((n23) obj2, lq4Var, 24);
            case 25:
                return new m5((ChatScreen) obj2, lq4Var, 25);
            case 26:
                return new m5((se3) obj2, lq4Var, 26);
            case 27:
                return new m5((eo3) obj2, lq4Var, 27);
            case 28:
                return new m5((ChatsTabWidget) obj2, lq4Var, 28);
            default:
                return new m5((my3) obj2, lq4Var, 29);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return ((m5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0343, code lost:
    
        if (defpackage.rx8.t(2000, r27) == r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x042b, code lost:
    
        if (defpackage.rx8.u(r2, r27) == r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05a1, code lost:
    
        if (r2.e(r27) == r3) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0718, code lost:
    
        if (defpackage.rx8.t(75, r27) == r1) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a01, code lost:
    
        if (r6.a(r3, r27) == r4) goto L458;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:345:0x0718 -> B:347:0x071c). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
