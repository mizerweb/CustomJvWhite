package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;
import com.vk.push.core.feature.FeatureManagerImpl;
import java.lang.reflect.InvocationTargetException;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;
import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class qy3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy3(Object obj, lq4 lq4Var, int i) {
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
                return new qy3((ry3) obj2, lq4Var, 0);
            case 1:
                return new qy3((ty3) obj2, lq4Var, 1);
            case 2:
                qy3 qy3Var = new qy3((q04) obj2, lq4Var, 2);
                qy3Var.f = ((Number) obj).intValue();
                return qy3Var;
            case 3:
                return new qy3((y34) obj2, lq4Var, 3);
            case 4:
                return new qy3((qb4) obj2, lq4Var, 4);
            case 5:
                return new qy3((fh4) obj2, lq4Var, 5);
            case 6:
                return new qy3((sy4) obj2, lq4Var, 6);
            case 7:
                return new qy3((y85) obj2, lq4Var, 7);
            case 8:
                return new qy3((rc5) obj2, lq4Var, 8);
            case 9:
                return new qy3((DeletePushTokenIfNoHostsWorker) obj2, lq4Var, 9);
            case 10:
                return new qy3((DevMenuFeatureTogglesPageScreen) obj2, lq4Var, 10);
            case 11:
                return new qy3((DeviceIdRepositoryImpl) obj2, lq4Var, 11);
            case 12:
                return new qy3((il5) obj2, lq4Var, 12);
            case 13:
                return new qy3((io5) obj2, lq4Var, 13);
            case 14:
                return new qy3((DownloadFileFromWebAppWorker) obj2, lq4Var, 14);
            case 15:
                return new qy3((DownloadFileWorker) obj2, lq4Var, 15);
            case 16:
                return new qy3((ej6) obj2, lq4Var, 16);
            case 17:
                return new qy3((hk6) obj2, lq4Var, 17);
            case 18:
                return new qy3((um6) obj2, lq4Var, 18);
            case 19:
                return new qy3((FeatureManagerImpl) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new qy3((ar6) obj2, lq4Var, 20);
            case 21:
                return new qy3((u87) obj2, lq4Var, 21);
            case 22:
                return new qy3((ej7) obj2, lq4Var, 22);
            case 23:
                return new qy3((im7) obj2, lq4Var, 23);
            case 24:
                return new qy3((pp7) obj2, lq4Var, 24);
            case 25:
                return new qy3((tz7) obj2, lq4Var, 25);
            case 26:
                return new qy3((ae8) obj2, lq4Var, 26);
            case 27:
                return new qy3((ye8) obj2, lq4Var, 27);
            case 28:
                return new qy3((bf8) obj2, lq4Var, 28);
            default:
                return new qy3((gm8) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                ((qy3) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return new qy3((DeletePushTokenIfNoHostsWorker) this.g, (lq4) obj2, 9).invokeSuspend(sbiVar);
            case 10:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            case 18:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qy3) create((rib) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qy3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:434:0x094c  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022d, code lost:
    
        if (r5.emit(r11, r35) == r1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ed, code lost:
    
        if (com.vk.push.core.feature.FeatureManagerImpl.access$saveIssueKeysBlacklist(r1, r35) == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0724, code lost:
    
        if (r0.emit(r5, r35) == r6) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07a0, code lost:
    
        if (defpackage.yab.K0(r0, r3, r35) == r6) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07bb, code lost:
    
        if (r1 == r6) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0966, code lost:
    
        if (r0.a(r1, r2, r4, r5, r8, r35) == r11) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011c, code lost:
    
        if (r0 == r2) goto L72;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 2546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
