package defpackage;

import android.graphics.Point;
import java.util.List;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p8d implements tf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p8d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                e7d e7dVar = (e7d) obj4;
                ((q8d) obj5).a.invoke(new kna(((Integer) obj).intValue(), (Point) obj2, ((Integer) obj3).intValue(), e7dVar, e7dVar.a));
                return sbi.a;
            default:
                return StereoRoomHandsQueueImpl.loadHandsQueue$lambda$0((StereoRoomHandsQueueImpl) obj5, (af7) obj4, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
        }
    }
}
