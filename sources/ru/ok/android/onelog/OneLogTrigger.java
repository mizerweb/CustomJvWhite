package ru.ok.android.onelog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class OneLogTrigger implements Parcelable {
    public static final Parcelable.Creator<OneLogTrigger> CREATOR = new Parcelable.Creator<OneLogTrigger>() { // from class: ru.ok.android.onelog.OneLogTrigger.1
        @Override // android.os.Parcelable.Creator
        public OneLogTrigger createFromParcel(Parcel parcel) {
            return new OneLogTrigger(Kind.values()[parcel.readInt()], parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        public OneLogTrigger[] newArray(int i) {
            return new OneLogTrigger[i];
        }
    };
    private final long count;
    private final Kind kind;

    public enum Kind {
        EXPLICIT_UPLOAD(""),
        EXCEEDED_COUNT(""),
        EXCEEDED_FILE_LENGTH("b"),
        EXCEEDED_MAX_TIME("ms"),
        PASSED_SILENCE_TIME("ms");

        private final String unit;

        Kind(String str) {
            this.unit = str;
        }

        public static Kind fromString(String str) {
            for (Kind kind : values()) {
                if (kind.unit.equals(str)) {
                    return kind;
                }
            }
            return null;
        }
    }

    private OneLogTrigger(Kind kind, long j) {
        this.kind = kind;
        this.count = j;
    }

    public static OneLogTrigger exceededCount(int i) {
        if (OneLogImpl.getInstance().isSendUploadTriggerEnabled()) {
            return new OneLogTrigger(Kind.EXCEEDED_COUNT, i);
        }
        return null;
    }

    public static OneLogTrigger exceededFileLength(long j) {
        if (OneLogImpl.getInstance().isSendUploadTriggerEnabled()) {
            return new OneLogTrigger(Kind.EXCEEDED_FILE_LENGTH, j);
        }
        return null;
    }

    public static OneLogTrigger exceededMaxTime(long j) {
        if (OneLogImpl.getInstance().isSendUploadTriggerEnabled()) {
            return new OneLogTrigger(Kind.EXCEEDED_MAX_TIME, j);
        }
        return null;
    }

    public static OneLogTrigger explicitUpload(int i) {
        if (OneLogImpl.getInstance().isSendUploadTriggerEnabled()) {
            return new OneLogTrigger(Kind.EXPLICIT_UPLOAD, i);
        }
        return null;
    }

    public static OneLogTrigger fromKindUnit(String str, long j) {
        Kind kindFromString;
        if (!OneLogImpl.getInstance().isSendUploadTriggerEnabled() || (kindFromString = Kind.fromString(str)) == null) {
            return null;
        }
        return new OneLogTrigger(kindFromString, j);
    }

    public static OneLogTrigger passedSilenceTime(long j) {
        if (OneLogImpl.getInstance().isSendUploadTriggerEnabled()) {
            return new OneLogTrigger(Kind.PASSED_SILENCE_TIME, j);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCount() {
        return this.count;
    }

    public String getKindUnit() {
        return this.kind.unit;
    }

    public OneLogItem toItem() {
        return OneLogItem.builder().setType(1).setCollector("ok.mobile.apps.operations").setOperation("log.externalLog.upload").setDatum(1, toString()).build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kind.toString().toLowerCase(Locale.US));
        if (this.count >= 0) {
            sb.append("_");
            sb.append(this.count);
            sb.append(this.kind.unit);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.kind.ordinal());
        parcel.writeLong(this.count);
    }

    public /* synthetic */ OneLogTrigger(Kind kind, long j, int i) {
        this(kind, j);
    }
}
