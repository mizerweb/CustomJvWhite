package ru.ok.android.onelog;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ore;
import defpackage.qv1;
import defpackage.zo5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OneLogItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<OneLogItem> CREATOR = new Creator(0);
    public static final int TYPE_DURATION_SUCCESS = 0;
    public static final int TYPE_FAILURE = 2;
    public static final int TYPE_NOP = -1;
    public static final int TYPE_SUCCESS = 1;
    private final String collector;
    private final int count;
    private final List<String> customKeys;
    private final List<String> customValues;
    private final List<String> data;
    private final List<String> groups;
    private final String network;
    private final String operation;
    private final long time;
    private final long timestamp;
    private final int type;
    private final String uid;

    private OneLogItem(Parcel parcel) {
        this.collector = parcel.readString();
        this.timestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.operation = parcel.readString();
        this.count = parcel.readInt();
        this.time = parcel.readLong();
        this.uid = parcel.readString();
        this.network = parcel.readString();
        this.groups = parcel.createStringArrayList();
        this.data = parcel.createStringArrayList();
        this.customKeys = parcel.createStringArrayList();
        this.customValues = parcel.createStringArrayList();
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public Builder buildUpon() {
        return new Builder(this.collector, this.type, this.operation, this.count, this.time, this.uid, this.network, this.groups, this.data, this.customKeys, this.customValues, 0);
    }

    public String collector() {
        return this.collector;
    }

    public int count() {
        return this.count;
    }

    public int customCount() {
        return this.customKeys.size();
    }

    public String customKey(int i) {
        return this.customKeys.get(i);
    }

    public String customValue(int i) {
        return this.customValues.get(i);
    }

    public int dataCount() {
        return this.data.size();
    }

    public String datum(int i) {
        return this.data.get(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String group(int i) {
        return this.groups.get(i);
    }

    public int groupsCount() {
        return this.groups.size();
    }

    public void log() {
        OneLog.log(this);
    }

    public String network() {
        return this.network;
    }

    public String operation() {
        return this.operation;
    }

    public long time() {
        return this.time;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{collector: ");
        sb.append(this.collector);
        sb.append(", timestamp: ");
        sb.append(this.timestamp);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", operation: ");
        sb.append(this.operation);
        sb.append(", time: ");
        sb.append(this.time);
        if (this.uid != null) {
            sb.append(", uid: ");
            sb.append(this.uid);
        }
        if (this.network != null) {
            sb.append(", network: ");
            sb.append(this.network);
        }
        if (this.count != 1) {
            sb.append(", count: ");
            sb.append(this.count);
            sb.append(", ");
        }
        if (!this.data.isEmpty()) {
            sb.append(", data: [");
            for (int i = 0; i < this.data.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.data.get(i));
            }
            sb.append("]");
        }
        if (!this.groups.isEmpty()) {
            sb.append(", groups: [");
            for (int i2 = 0; i2 < this.groups.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.groups.get(i2));
            }
            sb.append("]");
        }
        if (!this.customKeys.isEmpty()) {
            sb.append(", custom: {");
            for (int i3 = 0; i3 < this.customKeys.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(this.customKeys.get(i3));
                sb.append(": ");
                sb.append(this.customValues.get(i3));
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    public int type() {
        return this.type;
    }

    public String uid() {
        return this.uid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collector);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.type);
        parcel.writeString(this.operation);
        parcel.writeInt(this.count);
        parcel.writeLong(this.time);
        parcel.writeString(this.uid);
        parcel.writeString(this.network);
        parcel.writeStringList(this.groups);
        parcel.writeStringList(this.data);
        parcel.writeStringList(this.customKeys);
        parcel.writeStringList(this.customValues);
    }

    public static final class Creator implements Parcelable.Creator<OneLogItem> {
        public /* synthetic */ Creator(int i) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public OneLogItem createFromParcel(Parcel parcel) {
            return new OneLogItem(0, parcel);
        }

        private Creator() {
        }

        @Override // android.os.Parcelable.Creator
        public OneLogItem[] newArray(int i) {
            return new OneLogItem[i];
        }
    }

    public static final class Builder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static volatile NetworkClassProvider networkClassProvider;
        private static volatile UserIdProvider userIdProvider;
        private String collector;
        private int count;
        private ArrayList<String> customKeys;
        private ArrayList<String> customValues;
        private ArrayList<String> data;
        private ArrayList<String> groups;
        private String network;
        private boolean networkIsSet;
        private String operation;
        private long time;
        private int type;
        private String uid;
        private boolean uidIsSet;

        private Builder(String str, int i, String str2, int i2, long j, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
            this.collector = str;
            this.type = i;
            this.operation = str2;
            this.count = i2;
            this.time = j;
            this.uid = str3;
            this.uidIsSet = true;
            this.network = str4;
            this.networkIsSet = true;
            this.groups = copyNullableList(list);
            this.data = copyNullableList(list2);
            this.customKeys = copyNullableList(list3);
            this.customValues = copyNullableList(list4);
        }

        private String buildNetworkClass() {
            if (this.networkIsSet) {
                return this.network;
            }
            NetworkClassProvider networkClassProvider2 = networkClassProvider;
            if (networkClassProvider2 != null) {
                return networkClassProvider2.getNetworkClass();
            }
            return null;
        }

        private String buildUserId() {
            if (this.uidIsSet) {
                return this.uid;
            }
            UserIdProvider userIdProvider2 = userIdProvider;
            if (userIdProvider2 != null) {
                return userIdProvider2.getUserId();
            }
            return null;
        }

        private static <T> ArrayList<T> copyNullableList(List<T> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            return new ArrayList<>(list);
        }

        private void init() {
            this.collector = null;
            this.type = -1;
            this.operation = null;
            this.count = 1;
            this.time = 0L;
            this.uid = null;
            this.uidIsSet = false;
            this.network = null;
            this.networkIsSet = false;
            this.groups = null;
            this.data = null;
            this.customKeys = null;
            this.customValues = null;
        }

        private static <T> List<T> moveNonNullList(List<T> list) {
            return list == null ? Collections.EMPTY_LIST : list;
        }

        public static void setNetworkClassProvider(NetworkClassProvider networkClassProvider2) {
            networkClassProvider = networkClassProvider2;
        }

        public static void setUserIdProvider(UserIdProvider userIdProvider2) {
            userIdProvider = userIdProvider2;
        }

        private static ArrayList<String> withParam(ArrayList<String> arrayList, int i, String str) {
            if (str == null) {
                if (arrayList != null && arrayList.size() > i && arrayList.get(i) != null) {
                    arrayList.set(i, null);
                    while (qv1.f(1, arrayList) == null) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.ensureCapacity(i + 1);
            while (arrayList.size() <= i) {
                arrayList.add(null);
            }
            arrayList.set(i, str);
            return arrayList;
        }

        public OneLogItem build() {
            String str = this.collector;
            int i = this.type;
            String str2 = this.operation;
            int i2 = this.count;
            long j = this.time;
            String strBuildUserId = buildUserId();
            String strBuildNetworkClass = buildNetworkClass();
            List listMoveNonNullList = moveNonNullList(this.groups);
            List listMoveNonNullList2 = moveNonNullList(this.data);
            List listMoveNonNullList3 = moveNonNullList(this.customKeys);
            List listMoveNonNullList4 = moveNonNullList(this.customValues);
            init();
            if (str == null) {
                ore.k("Collector not set");
                return null;
            }
            if (str2 != null) {
                return new OneLogItem(str, i, str2, i2, j, strBuildUserId, strBuildNetworkClass, listMoveNonNullList, listMoveNonNullList2, listMoveNonNullList3, listMoveNonNullList4, 0);
            }
            ore.k("Operation not set");
            return null;
        }

        public Builder incCount(int i) {
            if (i >= 1) {
                this.count += i;
                return this;
            }
            ore.p(zo5.h(i, "Illegal count "));
            return null;
        }

        public Builder incTime(long j) {
            if (j >= 0) {
                this.time += j;
                return this;
            }
            ore.p(zo5.j(j, "Illegal time "));
            return null;
        }

        public void log() {
            build().log();
        }

        public Builder setCollector(Object obj) {
            return setCollector(obj != null ? obj.toString() : null);
        }

        public Builder setCount(int i) {
            if (i >= 1) {
                this.count = i;
                return this;
            }
            ore.p(zo5.h(i, "Illegal count "));
            return null;
        }

        public Builder setCustom(String str, String str2) {
            int iIndexOf;
            ArrayList<String> arrayList = this.customKeys;
            ArrayList<String> arrayList2 = this.customValues;
            if (str2 == null) {
                if (arrayList != null && (iIndexOf = arrayList.indexOf(str)) >= 0) {
                    arrayList.remove(iIndexOf);
                    arrayList2.remove(iIndexOf);
                }
                return this;
            }
            if (arrayList != null) {
                int iIndexOf2 = arrayList.indexOf(str);
                if (iIndexOf2 >= 0) {
                    arrayList2.set(iIndexOf2, str2);
                    return this;
                }
                arrayList.add(str);
                arrayList2.add(str2);
                return this;
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            arrayList3.add(str);
            arrayList4.add(str2);
            this.customKeys = arrayList3;
            this.customValues = arrayList4;
            return this;
        }

        public Builder setDatum(int i, Object obj) {
            return setDatum(i, obj != null ? obj.toString() : null);
        }

        public Builder setGroup(int i, Object obj) {
            return setGroup(i, obj != null ? obj.toString() : null);
        }

        public Builder setNetwork(String str) {
            this.network = str;
            this.networkIsSet = true;
            return this;
        }

        public Builder setOperation(Object obj) {
            return setOperation(obj != null ? obj.toString() : null);
        }

        public Builder setTime(long j) {
            if (j >= 0) {
                this.time = j;
                return this;
            }
            ore.p(zo5.j(j, "Illegal time "));
            return null;
        }

        public Builder setType(int i) {
            this.type = i;
            return this;
        }

        public Builder setUid(String str) {
            this.uid = str;
            this.uidIsSet = true;
            return this;
        }

        public Builder setCollector(String str) {
            this.collector = str;
            return this;
        }

        public Builder setDatum(int i, String str) {
            this.data = withParam(this.data, i, str);
            return this;
        }

        public Builder setGroup(int i, String str) {
            this.groups = withParam(this.groups, i, str);
            return this;
        }

        public Builder setOperation(String str) {
            this.operation = str;
            return this;
        }

        public /* synthetic */ Builder(String str, int i, String str2, int i2, long j, String str3, String str4, List list, List list2, List list3, List list4, int i3) {
            this(str, i, str2, i2, j, str3, str4, list, list2, list3, list4);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            init();
        }

        public Builder setCustom(Object obj, Object obj2) {
            return setCustom(obj.toString(), obj2 != null ? obj2.toString() : null);
        }
    }

    public /* synthetic */ OneLogItem(String str, int i, String str2, int i2, long j, String str3, String str4, List list, List list2, List list3, List list4, int i3) {
        this(str, i, str2, i2, j, str3, str4, list, list2, list3, list4);
    }

    private OneLogItem(String str, int i, String str2, int i2, long j, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.collector = str;
        this.type = i;
        this.operation = str2;
        this.count = i2;
        this.time = j;
        this.uid = str3;
        this.network = str4;
        this.groups = list;
        this.data = list2;
        this.customKeys = list3;
        this.customValues = list4;
        this.timestamp = System.currentTimeMillis();
    }

    public /* synthetic */ OneLogItem(int i, Parcel parcel) {
        this(parcel);
    }
}
