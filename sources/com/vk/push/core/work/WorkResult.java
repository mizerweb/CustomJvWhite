package com.vk.push.core.work;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i89;
import defpackage.j89;
import defpackage.k89;
import defpackage.l89;
import defpackage.ore;
import java.util.Locale;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/push/core/work/WorkResult;", "", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lsbi;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ll89;", "toListenableWorkerResult", "()Ll89;", "CREATOR", "SUCESSS", "FAILURE", "RETRY", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WorkResult implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WorkResult FAILURE;
    public static final WorkResult RETRY;
    public static final WorkResult SUCESSS;
    public static final /* synthetic */ WorkResult[] a;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkResult.values().length];
            try {
                iArr[WorkResult.SUCESSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkResult.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkResult.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.push.core.work.WorkResult$CREATOR] */
    static {
        WorkResult workResult = new WorkResult("SUCESSS", 0);
        SUCESSS = workResult;
        WorkResult workResult2 = new WorkResult("FAILURE", 1);
        FAILURE = workResult2;
        WorkResult workResult3 = new WorkResult("RETRY", 2);
        RETRY = workResult3;
        a = new WorkResult[]{workResult, workResult2, workResult3};
        INSTANCE = new Parcelable.Creator<WorkResult>(null) { // from class: com.vk.push.core.work.WorkResult.CREATOR
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WorkResult createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Enum enumValueOf = WorkResult.FAILURE;
                if (string != null) {
                    try {
                        enumValueOf = Enum.valueOf(WorkResult.class, string.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return (WorkResult) enumValueOf;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WorkResult[] newArray(int size) {
                return new WorkResult[size];
            }
        };
    }

    public static WorkResult valueOf(String str) {
        return (WorkResult) Enum.valueOf(WorkResult.class, str);
    }

    public static WorkResult[] values() {
        return (WorkResult[]) a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final l89 toListenableWorkerResult() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return new k89();
        }
        if (i == 2) {
            return new i89();
        }
        if (i == 3) {
            return new j89();
        }
        ore.o();
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
