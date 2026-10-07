package ru.ok.android.externcalls.analytics.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cqk;
import defpackage.j95;
import defpackage.nbh;
import defpackage.qt4;
import defpackage.qv1;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0011J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u001eR\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0019¨\u00060"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "Landroid/os/Parcelable;", "", "apiMethod", "collector", CallAnalyticsApiRequest.KEY_APPLICATION, "platform", "", "isExternal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "matches", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lsbi;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiMethod", "getCollector", "getApplication", "getPlatform", "Z", "key", "getKey", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EventChannel implements Parcelable {
    private final String apiMethod;
    private final String application;
    private final String collector;
    private final boolean isExternal;
    private final String key;
    private final String platform;
    public static final Parcelable.Creator<EventChannel> CREATOR = new Parcelable.Creator<EventChannel>() { // from class: ru.ok.android.externcalls.analytics.internal.event.EventChannel$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public EventChannel createFromParcel(Parcel source) {
            if (source == null) {
                return null;
            }
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            return new EventChannel(string, source.readString(), source.readString(), source.readString(), source.readInt() > 0);
        }

        @Override // android.os.Parcelable.Creator
        public EventChannel[] newArray(int size) {
            return new EventChannel[size];
        }
    };

    public EventChannel(String str, String str2, String str3, String str4, boolean z) {
        this.apiMethod = str;
        this.collector = str2;
        this.application = str3;
        this.platform = str4;
        this.isExternal = z;
        this.key = qv1.l("m_", str, "_c_", str2 == null ? "" : str2);
    }

    public static /* synthetic */ EventChannel copy$default(EventChannel eventChannel, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventChannel.apiMethod;
        }
        if ((i & 2) != 0) {
            str2 = eventChannel.collector;
        }
        if ((i & 4) != 0) {
            str3 = eventChannel.application;
        }
        if ((i & 8) != 0) {
            str4 = eventChannel.platform;
        }
        if ((i & 16) != 0) {
            z = eventChannel.isExternal;
        }
        boolean z2 = z;
        String str5 = str3;
        return eventChannel.copy(str, str2, str5, str4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiMethod() {
        return this.apiMethod;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollector() {
        return this.collector;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplication() {
        return this.application;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    public final EventChannel copy(String apiMethod, String collector, String application, String platform, boolean isExternal) {
        return new EventChannel(apiMethod, collector, application, platform, isExternal);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventChannel)) {
            return false;
        }
        EventChannel eventChannel = (EventChannel) other;
        return cqk.d(this.apiMethod, eventChannel.apiMethod) && cqk.d(this.collector, eventChannel.collector) && cqk.d(this.application, eventChannel.application) && cqk.d(this.platform, eventChannel.platform) && this.isExternal == eventChannel.isExternal;
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getCollector() {
        return this.collector;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        int iHashCode = this.apiMethod.hashCode() * 31;
        String str = this.collector;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.application;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        return Boolean.hashCode(this.isExternal) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final boolean matches(CallAnalyticsEvent event) {
        return cqk.d(event.getApiMethodName(), this.apiMethod) && cqk.d(event.getCollector(), this.collector);
    }

    public String toString() {
        String str = this.apiMethod;
        String str2 = this.collector;
        String str3 = this.application;
        String str4 = this.platform;
        boolean z = this.isExternal;
        StringBuilder sbQ = qv1.q("EventChannel(apiMethod=", str, ", collector=", str2, ", application=");
        nbh.G(sbQ, str3, ", platform=", str4, ", isExternal=");
        return qt4.r(sbQ, z, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.apiMethod);
        dest.writeString(this.collector);
        dest.writeString(this.application);
        dest.writeString(this.platform);
        dest.writeInt(this.isExternal ? 1 : 0);
    }

    public /* synthetic */ EventChannel(String str, String str2, String str3, String str4, boolean z, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z);
    }
}
