package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import one.me.main.MainScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.settings.devices.hintdialog.QrAuthHintBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes4.dex */
public final class ur8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur8(Object obj, lq4 lq4Var, int i) {
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
                return new ur8((vr8) obj2, lq4Var, 0);
            case 1:
                return new ur8((js8) obj2, lq4Var, 1);
            case 2:
                return new ur8((JsonSerializableFileDataStoreImpl) obj2, lq4Var, 2);
            case 3:
                return new ur8((fz6) obj2, lq4Var, 3);
            case 4:
                return new ur8((ae9) obj2, lq4Var, 4);
            case 5:
                return new ur8((wg9) obj2, lq4Var, 5);
            case 6:
                return new ur8((MainScreen) obj2, lq4Var, 6);
            case 7:
                return new ur8((a9a) obj2, lq4Var, 7);
            case 8:
                ur8 ur8Var = new ur8((MessageWriteWidget) obj2, lq4Var, 8);
                ur8Var.f = ((Number) obj).intValue();
                return ur8Var;
            case 9:
                return new ur8((jsa) obj2, lq4Var, 9);
            case 10:
                return new ur8((fva) obj2, lq4Var, 10);
            case 11:
                return new ur8((a0b) obj2, lq4Var, 11);
            case 12:
                return new ur8((y6b) obj2, lq4Var, 12);
            case 13:
                return new ur8((pfb) obj2, lq4Var, 13);
            case 14:
                return new ur8((kob) obj2, lq4Var, 14);
            case 15:
                return new ur8((bxb) obj2, lq4Var, 15);
            case 16:
                return new ur8((kzb) obj2, lq4Var, 16);
            case 17:
                return new ur8((lzb) obj2, lq4Var, 17);
            case 18:
                return new ur8((dxc) obj2, lq4Var, 18);
            case 19:
                return new ur8((g85) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ur8((ild) obj2, lq4Var, 20);
            case 21:
                return new ur8((dqd) obj2, lq4Var, 21);
            case 22:
                return new ur8((srd) obj2, lq4Var, 22);
            case 23:
                return new ur8((js8) obj2, lq4Var, 23);
            case 24:
                return new ur8((QrAuthHintBottomSheet) obj2, lq4Var, 24);
            case 25:
                return new ur8((a8e) obj2, lq4Var, 25);
            case 26:
                return new ur8((jce) obj2, lq4Var, 26);
            case 27:
                return new ur8((xte) obj2, lq4Var, 27);
            case 28:
                return new ur8((lxe) obj2, lq4Var, 28);
            default:
                return new ur8((SdkCoroutineWorker) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((ur8) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                ((ur8) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ur8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:330:0x0653  */
    /* JADX WARN: Code duplicated, block: B:332:0x065d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04d3, code lost:
    
        if (defpackage.yab.K0(r15, r1, r14) == r0) goto L244;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
