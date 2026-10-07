package com.vk.push.core.work;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cqk;
import defpackage.j95;
import java.util.Locale;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0002,-B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006."}, d2 = {"Lcom/vk/push/core/work/WorkModel;", "Landroid/os/Parcelable;", "", "workName", "Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "keepExistingWork", "Landroid/os/Bundle;", "params", "<init>", "(Ljava/lang/String;Lcom/vk/push/core/work/WorkModel$KeepExistingWork;Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "Lsbi;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "component3", "()Landroid/os/Bundle;", "copy", "(Ljava/lang/String;Lcom/vk/push/core/work/WorkModel$KeepExistingWork;Landroid/os/Bundle;)Lcom/vk/push/core/work/WorkModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getWorkName", "b", "Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "getKeepExistingWork", DatabaseHelper.COMPRESSED_COLUMN_NAME, "Landroid/os/Bundle;", "getParams", "CREATOR", "KeepExistingWork", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class WorkModel implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String workName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final KeepExistingWork keepExistingWork;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Bundle params;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "", "Companion", "YES", "NO", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class KeepExistingWork {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final KeepExistingWork NO;
        public static final KeepExistingWork YES;
        public static final /* synthetic */ KeepExistingWork[] a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/work/WorkModel$KeepExistingWork$Companion;", "", "", "Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "toKeepExistingWorkModel", "(Z)Lcom/vk/push/core/work/WorkModel$KeepExistingWork;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public Companion(j95 j95Var) {
            }

            public final KeepExistingWork toKeepExistingWorkModel(boolean z) {
                return z ? KeepExistingWork.YES : KeepExistingWork.NO;
            }
        }

        static {
            KeepExistingWork keepExistingWork = new KeepExistingWork("YES", 0);
            YES = keepExistingWork;
            KeepExistingWork keepExistingWork2 = new KeepExistingWork("NO", 1);
            NO = keepExistingWork2;
            a = new KeepExistingWork[]{keepExistingWork, keepExistingWork2};
            INSTANCE = new Companion(null);
        }

        public static KeepExistingWork valueOf(String str) {
            return (KeepExistingWork) Enum.valueOf(KeepExistingWork.class, str);
        }

        public static KeepExistingWork[] values() {
            return (KeepExistingWork[]) a.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkModel(Parcel parcel) {
        String string = parcel.readString();
        String string2 = parcel.readString();
        Enum enumValueOf = KeepExistingWork.YES;
        if (string2 != null) {
            try {
                enumValueOf = Enum.valueOf(KeepExistingWork.class, string2.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
            }
        }
        this(string, (KeepExistingWork) enumValueOf, parcel.readBundle(Bundle.class.getClassLoader()));
    }

    public static /* synthetic */ WorkModel copy$default(WorkModel workModel, String str, KeepExistingWork keepExistingWork, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workModel.workName;
        }
        if ((i & 2) != 0) {
            keepExistingWork = workModel.keepExistingWork;
        }
        if ((i & 4) != 0) {
            bundle = workModel.params;
        }
        return workModel.copy(str, keepExistingWork, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWorkName() {
        return this.workName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KeepExistingWork getKeepExistingWork() {
        return this.keepExistingWork;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bundle getParams() {
        return this.params;
    }

    public final WorkModel copy(String workName, KeepExistingWork keepExistingWork, Bundle params) {
        return new WorkModel(workName, keepExistingWork, params);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkModel)) {
            return false;
        }
        WorkModel workModel = (WorkModel) other;
        return cqk.d(this.workName, workModel.workName) && this.keepExistingWork == workModel.keepExistingWork && cqk.d(this.params, workModel.params);
    }

    public final KeepExistingWork getKeepExistingWork() {
        return this.keepExistingWork;
    }

    public final Bundle getParams() {
        return this.params;
    }

    public final String getWorkName() {
        return this.workName;
    }

    public int hashCode() {
        String str = this.workName;
        int iHashCode = (this.keepExistingWork.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Bundle bundle = this.params;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        return "WorkModel(workName=" + this.workName + ", keepExistingWork=" + this.keepExistingWork + ", params=" + this.params + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.workName);
        parcel.writeString(this.keepExistingWork.name());
        parcel.writeBundle(this.params);
    }

    /* JADX INFO: renamed from: com.vk.push.core.work.WorkModel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/push/core/work/WorkModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/work/WorkModel;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/core/work/WorkModel;", "", "size", "", "newArray", "(I)[Lcom/vk/push/core/work/WorkModel;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WorkModel> {
        public Companion(j95 j95Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkModel createFromParcel(Parcel parcel) {
            return new WorkModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkModel[] newArray(int size) {
            return new WorkModel[size];
        }
    }

    public WorkModel(String str, KeepExistingWork keepExistingWork, Bundle bundle) {
        this.workName = str;
        this.keepExistingWork = keepExistingWork;
        this.params = bundle;
    }
}
