package defpackage;

import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class sh2 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh2(Object obj, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new sh2((wfe) obj, lq4Var, 0);
            case 1:
                return new sh2((zm2) obj, lq4Var, 1);
            case 2:
                return new sh2((kb9) obj, lq4Var, 2);
            case 3:
                return new sh2((vei) obj, lq4Var, 3);
            default:
                return new sh2((MediaMetadataRetriever) obj, lq4Var, 4);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws InterruptedException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                return ((sh2) create(lq4Var)).invokeSuspend(sbiVar);
            case 1:
                ((sh2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                return ((sh2) create(lq4Var)).invokeSuspend(sbiVar);
            case 3:
                return ((sh2) create(lq4Var)).invokeSuspend(sbiVar);
            default:
                return ((sh2) create(lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((wfe) obj2).a = null;
                return new nfc(null, new ne2(13), 1);
            case 1:
                ch3.d0(obj);
                ((zm2) obj2).w.await();
                return sbi.a;
            case 2:
                ch3.d0(obj);
                Long l = ((kb9) obj2).g;
                return new Long(l != null ? l.longValue() : 0L);
            case 3:
                ch3.d0(obj);
                vei veiVar = (vei) obj2;
                ConcurrentHashMap concurrentHashMap = ((no4) veiVar.b.getValue()).a.a;
                mw mwVar = new mw(concurrentHashMap.size());
                mwVar.putAll(concurrentHashMap);
                Collection collectionValues = mwVar.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((fdd) veiVar.e.getValue()).test((vg4) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                ch3.d0(obj);
                String strExtractMetadata = ((MediaMetadataRetriever) obj2).extractMetadata(9);
                return new Long(strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L);
        }
    }
}
