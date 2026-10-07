package ru.ok.android.externcalls.sdk.stereo.listener;

import defpackage.cqk;
import defpackage.qv1;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoHandQueueItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "event", "Lsbi;", "onListenersChanged", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "onHandStatusChange", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "onPromotionRequestUpdated", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;)V", "", "isPromoted", "onOwnPromotionChanged", "(Z)V", "ListenersUpdated", "HandStatusUpdated", "PromotionRequestUpdated", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StereoRoomManagerListener {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "", "totalCount", "", "raisedHands", "", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "<init>", "(ILjava/util/List;)V", "getTotalCount", "()I", "getRaisedHands", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandStatusUpdated {
        private final List<StereoHandQueueItem> raisedHands;
        private final int totalCount;

        public HandStatusUpdated(int i, List<StereoHandQueueItem> list) {
            this.totalCount = i;
            this.raisedHands = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HandStatusUpdated copy$default(HandStatusUpdated handStatusUpdated, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = handStatusUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = handStatusUpdated.raisedHands;
            }
            return handStatusUpdated.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public final List<StereoHandQueueItem> component2() {
            return this.raisedHands;
        }

        public final HandStatusUpdated copy(int totalCount, List<StereoHandQueueItem> raisedHands) {
            return new HandStatusUpdated(totalCount, raisedHands);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandStatusUpdated)) {
                return false;
            }
            HandStatusUpdated handStatusUpdated = (HandStatusUpdated) other;
            return this.totalCount == handStatusUpdated.totalCount && cqk.d(this.raisedHands, handStatusUpdated.raisedHands);
        }

        public final List<StereoHandQueueItem> getRaisedHands() {
            return this.raisedHands;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.raisedHands.hashCode() + (Integer.hashCode(this.totalCount) * 31);
        }

        public String toString() {
            return "HandStatusUpdated(totalCount=" + this.totalCount + ", raisedHands=" + this.raisedHands + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "", "totalCount", "", "addedParticipantIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "removedParticipantIds", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "getTotalCount", "()I", "getAddedParticipantIds", "()Ljava/util/List;", "getRemovedParticipantIds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListenersUpdated {
        private final List<ParticipantId> addedParticipantIds;
        private final List<ParticipantId> removedParticipantIds;
        private final int totalCount;

        public ListenersUpdated(int i, List<ParticipantId> list, List<ParticipantId> list2) {
            this.totalCount = i;
            this.addedParticipantIds = list;
            this.removedParticipantIds = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListenersUpdated copy$default(ListenersUpdated listenersUpdated, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = listenersUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = listenersUpdated.addedParticipantIds;
            }
            if ((i2 & 4) != 0) {
                list2 = listenersUpdated.removedParticipantIds;
            }
            return listenersUpdated.copy(i, list, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public final List<ParticipantId> component2() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> component3() {
            return this.removedParticipantIds;
        }

        public final ListenersUpdated copy(int totalCount, List<ParticipantId> addedParticipantIds, List<ParticipantId> removedParticipantIds) {
            return new ListenersUpdated(totalCount, addedParticipantIds, removedParticipantIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenersUpdated)) {
                return false;
            }
            ListenersUpdated listenersUpdated = (ListenersUpdated) other;
            return this.totalCount == listenersUpdated.totalCount && cqk.d(this.addedParticipantIds, listenersUpdated.addedParticipantIds) && cqk.d(this.removedParticipantIds, listenersUpdated.removedParticipantIds);
        }

        public final List<ParticipantId> getAddedParticipantIds() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> getRemovedParticipantIds() {
            return this.removedParticipantIds;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.removedParticipantIds.hashCode() + qv1.c(Integer.hashCode(this.totalCount) * 31, 31, this.addedParticipantIds);
        }

        public String toString() {
            int i = this.totalCount;
            List<ParticipantId> list = this.addedParticipantIds;
            List<ParticipantId> list2 = this.removedParticipantIds;
            StringBuilder sb = new StringBuilder("ListenersUpdated(totalCount=");
            sb.append(i);
            sb.append(", addedParticipantIds=");
            sb.append(list);
            sb.append(", removedParticipantIds=");
            return qv1.n(")", sb, list2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "", "approved", "", "<init>", "(Z)V", "getApproved", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromotionRequestUpdated {
        private final boolean approved;

        public PromotionRequestUpdated(boolean z) {
            this.approved = z;
        }

        public static /* synthetic */ PromotionRequestUpdated copy$default(PromotionRequestUpdated promotionRequestUpdated, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = promotionRequestUpdated.approved;
            }
            return promotionRequestUpdated.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getApproved() {
            return this.approved;
        }

        public final PromotionRequestUpdated copy(boolean approved) {
            return new PromotionRequestUpdated(approved);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PromotionRequestUpdated) && this.approved == ((PromotionRequestUpdated) other).approved;
        }

        public final boolean getApproved() {
            return this.approved;
        }

        public int hashCode() {
            return Boolean.hashCode(this.approved);
        }

        public String toString() {
            return qv1.m("PromotionRequestUpdated(approved=", ")", this.approved);
        }
    }

    void onHandStatusChange(HandStatusUpdated event);

    void onListenersChanged(ListenersUpdated event);

    void onOwnPromotionChanged(boolean isPromoted);

    void onPromotionRequestUpdated(PromotionRequestUpdated event);
}
