package ru.ok.android.externcalls.sdk.ml.model;

import defpackage.cqk;
import defpackage.zo5;
import java.io.Serializable;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/AvailableMLFeatureInfo;", "Ljava/io/Serializable;", "type", "Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "version", "", ClientCookie.PATH_ATTR, "<init>", "(Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "getVersion", "()Ljava/lang/String;", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AvailableMLFeatureInfo implements Serializable {
    private final String path;
    private final MLFeatureType type;
    private final String version;

    public AvailableMLFeatureInfo(MLFeatureType mLFeatureType, String str, String str2) {
        this.type = mLFeatureType;
        this.version = str;
        this.path = str2;
    }

    public static /* synthetic */ AvailableMLFeatureInfo copy$default(AvailableMLFeatureInfo availableMLFeatureInfo, MLFeatureType mLFeatureType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            mLFeatureType = availableMLFeatureInfo.type;
        }
        if ((i & 2) != 0) {
            str = availableMLFeatureInfo.version;
        }
        if ((i & 4) != 0) {
            str2 = availableMLFeatureInfo.path;
        }
        return availableMLFeatureInfo.copy(mLFeatureType, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MLFeatureType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final AvailableMLFeatureInfo copy(MLFeatureType type, String version, String path) {
        return new AvailableMLFeatureInfo(type, version, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableMLFeatureInfo)) {
            return false;
        }
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) other;
        return this.type == availableMLFeatureInfo.type && cqk.d(this.version, availableMLFeatureInfo.version) && cqk.d(this.path, availableMLFeatureInfo.path);
    }

    public final String getPath() {
        return this.path;
    }

    public final MLFeatureType getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.path.hashCode() + zo5.d(this.type.hashCode() * 31, 31, this.version);
    }

    public String toString() {
        MLFeatureType mLFeatureType = this.type;
        String str = this.version;
        String str2 = this.path;
        StringBuilder sb = new StringBuilder("AvailableMLFeatureInfo(type=");
        sb.append(mLFeatureType);
        sb.append(", version=");
        sb.append(str);
        sb.append(", path=");
        return zo5.w(sb, str2, ")");
    }
}
