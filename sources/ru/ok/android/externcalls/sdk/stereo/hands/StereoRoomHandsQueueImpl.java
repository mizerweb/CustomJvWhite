package ru.ok.android.externcalls.sdk.stereo.hands;

import defpackage.af7;
import defpackage.cf7;
import defpackage.e9i;
import defpackage.esh;
import defpackage.gsh;
import defpackage.h62;
import defpackage.i8f;
import defpackage.k62;
import defpackage.p8d;
import defpackage.qf7;
import defpackage.sbi;
import defpackage.ww3;
import defpackage.xre;
import defpackage.yt1;
import defpackage.yw3;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J;\u0010)\u001a\u00020\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R6\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R,\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R8\u00106\u001a&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a04j\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/Function0;", "Lsbi;", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lesh;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lqf7;Lcf7;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lesh;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", DatabaseHelper.ITEM_COLUMN_NAME, "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lcf7;Lcf7;)V", "Lk62;", "event", "onHandUp", "(Lk62;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lqf7;", "Lcf7;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lesh;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    private final cf7 getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    private boolean hasMore = true;
    private final qf7 idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final esh timeProvider;
    private int totalCount;

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, qf7 qf7Var, cf7 cf7Var, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, esh eshVar) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = qf7Var;
        this.getExternalId = cf7Var;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = eshVar;
    }

    private final void loadHandsQueue(af7 onSuccess, cf7 onError) {
        this.commandExecutor.getHandsQueue(new p8d(this, 1, onSuccess), onError);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(af7Var, cf7Var);
    }

    public static final sbi loadHandsQueue$lambda$0(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, af7 af7Var, int i, boolean z, List list) {
        stereoRoomHandsQueueImpl.totalCount = i;
        stereoRoomHandsQueueImpl.hasMore = z;
        qf7 qf7Var = stereoRoomHandsQueueImpl.idsResolverHelper;
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((h62) it.next()).b);
        }
        qf7Var.invoke(arrayList, new i8f(list, af7Var, stereoRoomHandsQueueImpl, 4));
        return sbi.a;
    }

    public static final sbi loadHandsQueue$lambda$0$1(List list, af7 af7Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h62 h62Var = (h62) it.next();
            ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(h62Var.b);
            if (participantId != null) {
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, h62Var.a), true);
            }
        }
        af7Var.invoke();
        stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
        return sbi.a;
    }

    public static final sbi loadMoreElements$lambda$0(cf7 cf7Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        if (cf7Var != null) {
            cf7Var.invoke(stereoRoomHandsQueueImpl);
        }
        return sbi.a;
    }

    private final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    public static final sbi onHandUp$lambda$0(k62 k62Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        Iterator it = k62Var.c.iterator();
        while (it.hasNext()) {
            ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke((yt1) it.next());
            if (participantId != null) {
                ((gsh) stereoRoomHandsQueueImpl.timeProvider).getClass();
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, Clock.systemUTC().millis()), false);
            }
        }
        Iterator it2 = k62Var.b.iterator();
        while (it2.hasNext()) {
            ParticipantId participantId2 = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke((yt1) it2.next());
            if (participantId2 != null) {
                ((gsh) stereoRoomHandsQueueImpl.timeProvider).getClass();
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId2, Clock.systemUTC().millis()), true);
            }
        }
        stereoRoomHandsQueueImpl.totalCount = k62Var.a;
        stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
        return sbi.a;
    }

    private final void participantHandChanged(StereoHandQueueItem stereoHandQueueItem, boolean raised) {
        HashMap<ParticipantId, StereoHandQueueItem> map = this.handQueue;
        if (raised) {
            map.put(stereoHandQueueItem.getParticipantId(), stereoHandQueueItem);
        } else {
            map.remove(stereoHandQueueItem.getParticipantId());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> map = this.handQueue;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<ParticipantId, StereoHandQueueItem>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            StereoHandQueueItem value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return ww3.M1(arrayList, new Comparator() { // from class: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return e9i.D(Long.valueOf(((StereoHandQueueItem) t).getAddedTs()), Long.valueOf(((StereoHandQueueItem) t2).getAddedTs()));
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public int getTotalCount() {
        return this.totalCount;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public boolean getHasMore() {
        return this.hasMore;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public void loadMoreElements(cf7 onSuccess, cf7 onError) {
        loadHandsQueue(new xre(onSuccess, 17, this), onError);
    }

    public final void onHandUp(k62 event) {
        this.idsResolverHelper.invoke(ww3.G1(event.c, event.b), new xre(event, 18, this));
    }
}
