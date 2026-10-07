package ru.ok.android.externcalls.sdk.video;

import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "condition", "Lsbi;", "applyFilter", "(Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;)V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", CallAnalyticsApiRequest.KEY_ITEMS, "sendDisplayLayouts", "(Ljava/util/Collection;)V", "SendFilter", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface DisplayLayoutSender {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "", "shouldSend", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SendFilter {
        boolean shouldSend();
    }

    void applyFilter(SendFilter condition);

    void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> items);
}
