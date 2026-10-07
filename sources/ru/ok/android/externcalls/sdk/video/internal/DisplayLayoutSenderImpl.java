package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.cf7;
import defpackage.mg1;
import defpackage.r66;
import defpackage.v4j;
import defpackage.xtj;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/DisplayLayoutSenderImpl;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "store", "", "Lmg1;", "Lsbi;", "sender", "<init>", "(Lcf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "condition", "applyFilter", "(Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;)V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", CallAnalyticsApiRequest.KEY_ITEMS, "sendDisplayLayouts", "(Ljava/util/Collection;)V", "Lcf7;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DisplayLayoutSenderImpl implements DisplayLayoutSender {
    private DisplayLayoutSender.SendFilter condition;
    private final cf7 sender;
    private final cf7 store;

    public DisplayLayoutSenderImpl(cf7 cf7Var, cf7 cf7Var2) {
        this.store = cf7Var;
        this.sender = cf7Var2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void applyFilter(DisplayLayoutSender.SendFilter condition) {
        this.condition = condition;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> items) {
        yt1 yt1Var;
        DisplayLayoutSender.SendFilter sendFilter = this.condition;
        if (sendFilter != null && !sendFilter.shouldSend()) {
            this.sender.invoke(r66.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationDisplayLayoutItem conversationDisplayLayoutItem : items) {
            v4j type = conversationDisplayLayoutItem.getVideoTrackParticipantKey().getType();
            ConversationParticipant conversationParticipant = (ConversationParticipant) this.store.invoke(conversationDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            if (conversationParticipant != null && conversationParticipant.isUseable() && (yt1Var = conversationParticipant.getCallParticipant().a) != null) {
                xtj xtjVar = new xtj(4);
                xtjVar.b = yt1Var;
                xtjVar.c = type;
                xtjVar.d = conversationDisplayLayoutItem.getVideoTrackParticipantKey().getMovieId();
                arrayList.add(new mg1(xtjVar.p(), conversationDisplayLayoutItem.getLayout()));
            }
        }
        this.sender.invoke(arrayList);
    }
}
