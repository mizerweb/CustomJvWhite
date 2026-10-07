package ru.ok.android.externcalls.analytics.events;

import defpackage.cqk;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "StringValue", "BooleanValue", "IntValue", "LongValue", "FloatValue", "ArrStringValue", "MapStringStringValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue$ArrStringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$BooleanValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$FloatValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$IntValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$LongValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$MapStringStringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$StringValue;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface EventItemValue {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u0004H\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$ArrStringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "", "constructor-impl", "(Ljava/util/Collection;)Ljava/util/Collection;", "getValue", "()Ljava/util/Collection;", "toString", "toString-impl", "(Ljava/util/Collection;)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/Collection;)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ArrStringValue implements EventItemValue {
        private final Collection<String> value;

        private /* synthetic */ ArrStringValue(Collection collection) {
            this.value = collection;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ArrStringValue m42boximpl(Collection collection) {
            return new ArrStringValue(collection);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Collection<? extends String> m43constructorimpl(Collection<String> collection) {
            return collection;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m44equalsimpl(Collection<? extends String> collection, Object obj) {
            return (obj instanceof ArrStringValue) && cqk.d(collection, ((ArrStringValue) obj).getValue());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m45equalsimpl0(Collection<? extends String> collection, Collection<? extends String> collection2) {
            return cqk.d(collection, collection2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m46hashCodeimpl(Collection<? extends String> collection) {
            return collection.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m47toStringimpl(Collection<? extends String> collection) {
            return collection.toString();
        }

        public boolean equals(Object obj) {
            return m44equalsimpl(this.value, obj);
        }

        public final Collection<String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return m46hashCodeimpl(this.value);
        }

        public String toString() {
            return m47toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Collection getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$BooleanValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "constructor-impl", "(Z)Z", "getValue", "()Z", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "equals", "other", "", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BooleanValue implements EventItemValue {
        private final boolean value;

        private /* synthetic */ BooleanValue(boolean z) {
            this.value = z;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ BooleanValue m49boximpl(boolean z) {
            return new BooleanValue(z);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static boolean m50constructorimpl(boolean z) {
            return z;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m51equalsimpl(boolean z, Object obj) {
            return (obj instanceof BooleanValue) && z == ((BooleanValue) obj).m55unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m52equalsimpl0(boolean z, boolean z2) {
            return z == z2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m53hashCodeimpl(boolean z) {
            return Boolean.hashCode(z);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m54toStringimpl(boolean z) {
            return String.valueOf(z);
        }

        public boolean equals(Object obj) {
            return m51equalsimpl(this.value, obj);
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return m53hashCodeimpl(this.value);
        }

        public String toString() {
            return m54toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ boolean m55unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$FloatValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "constructor-impl", "(F)F", "getValue", "()F", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FloatValue implements EventItemValue {
        private final float value;

        private /* synthetic */ FloatValue(float f) {
            this.value = f;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FloatValue m56boximpl(float f) {
            return new FloatValue(f);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m57constructorimpl(float f) {
            return f;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m58equalsimpl(float f, Object obj) {
            return (obj instanceof FloatValue) && Float.compare(f, ((FloatValue) obj).m62unboximpl()) == 0;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m59equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m60hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m61toStringimpl(float f) {
            return String.valueOf(f);
        }

        public boolean equals(Object obj) {
            return m58equalsimpl(this.value, obj);
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return m60hashCodeimpl(this.value);
        }

        public String toString() {
            return m61toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m62unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$IntValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "constructor-impl", "(I)I", "getValue", "()I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IntValue implements EventItemValue {
        private final int value;

        private /* synthetic */ IntValue(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntValue m63boximpl(int i) {
            return new IntValue(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m64constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m65equalsimpl(int i, Object obj) {
            return (obj instanceof IntValue) && i == ((IntValue) obj).m69unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m66equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m67hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m68toStringimpl(int i) {
            return String.valueOf(i);
        }

        public boolean equals(Object obj) {
            return m65equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return m67hashCodeimpl(this.value);
        }

        public String toString() {
            return m68toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m69unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$LongValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "constructor-impl", "(J)J", "getValue", "()J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LongValue implements EventItemValue {
        private final long value;

        private /* synthetic */ LongValue(long j) {
            this.value = j;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LongValue m70boximpl(long j) {
            return new LongValue(j);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m71constructorimpl(long j) {
            return j;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m72equalsimpl(long j, Object obj) {
            return (obj instanceof LongValue) && j == ((LongValue) obj).m76unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m73equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m74hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m75toStringimpl(long j) {
            return String.valueOf(j);
        }

        public boolean equals(Object obj) {
            return m72equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m74hashCodeimpl(this.value);
        }

        public String toString() {
            return m75toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m76unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u0004H\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$MapStringStringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "", "constructor-impl", "(Ljava/util/Map;)Ljava/util/Map;", "getValue", "()Ljava/util/Map;", "toString", "toString-impl", "(Ljava/util/Map;)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/util/Map;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/Map;)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MapStringStringValue implements EventItemValue {
        private final Map<String, String> value;

        private /* synthetic */ MapStringStringValue(Map map) {
            this.value = map;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ MapStringStringValue m77boximpl(Map map) {
            return new MapStringStringValue(map);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Map<String, ? extends String> m78constructorimpl(Map<String, String> map) {
            return map;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m79equalsimpl(Map<String, ? extends String> map, Object obj) {
            return (obj instanceof MapStringStringValue) && cqk.d(map, ((MapStringStringValue) obj).getValue());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m80equalsimpl0(Map<String, ? extends String> map, Map<String, ? extends String> map2) {
            return cqk.d(map, map2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m81hashCodeimpl(Map<String, ? extends String> map) {
            return map.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m82toStringimpl(Map<String, ? extends String> map) {
            return map.toString();
        }

        public boolean equals(Object obj) {
            return m79equalsimpl(this.value, obj);
        }

        public final Map<String, String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return m81hashCodeimpl(this.value);
        }

        public String toString() {
            return m82toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Map getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\u0003H\u0096\u0080\u0004¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$StringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StringValue implements EventItemValue {
        private final String value;

        private /* synthetic */ StringValue(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ StringValue m84boximpl(String str) {
            return new StringValue(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m85constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m86equalsimpl(String str, Object obj) {
            return (obj instanceof StringValue) && cqk.d(str, ((StringValue) obj).m90unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m87equalsimpl0(String str, String str2) {
            return cqk.d(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m88hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m89toStringimpl(String str) {
            return str.toString();
        }

        public boolean equals(Object obj) {
            return m86equalsimpl(this.value, obj);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m88hashCodeimpl(this.value);
        }

        public String toString() {
            return m89toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m90unboximpl() {
            return this.value;
        }
    }
}
