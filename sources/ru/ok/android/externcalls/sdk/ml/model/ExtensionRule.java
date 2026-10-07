package ru.ok.android.externcalls.sdk.ml.model;

import defpackage.c0a;
import defpackage.cqk;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule;", "", "isSatisfied", "", "actual", "", "", "Required", "OneOf", "Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule$OneOf;", "Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule$Required;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ExtensionRule {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule$OneOf;", "Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule;", "expected", "", "", "<init>", "(Ljava/util/Set;)V", "getExpected", "()Ljava/util/Set;", "isSatisfied", "", "actual", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OneOf implements ExtensionRule {
        private final Set<String> expected;

        public OneOf(Set<String> set) {
            this.expected = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OneOf copy$default(OneOf oneOf, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = oneOf.expected;
            }
            return oneOf.copy(set);
        }

        public final Set<String> component1() {
            return this.expected;
        }

        public final OneOf copy(Set<String> expected) {
            return new OneOf(expected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OneOf) && cqk.d(this.expected, ((OneOf) other).expected);
        }

        public final Set<String> getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.expected.hashCode();
        }

        @Override // ru.ok.android.externcalls.sdk.ml.model.ExtensionRule
        public boolean isSatisfied(Set<String> actual) {
            Set<String> set = this.expected;
            if (set != null && set.isEmpty()) {
                return false;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (actual.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return "OneOf(expected=" + this.expected + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule$Required;", "Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule;", "expected", "", "<init>", "(Ljava/lang/String;)V", "getExpected", "()Ljava/lang/String;", "isSatisfied", "", "actual", "", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Required implements ExtensionRule {
        private final String expected;

        public Required(String str) {
            this.expected = str;
        }

        public static /* synthetic */ Required copy$default(Required required, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = required.expected;
            }
            return required.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExpected() {
            return this.expected;
        }

        public final Required copy(String expected) {
            return new Required(expected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Required) && cqk.d(this.expected, ((Required) other).expected);
        }

        public final String getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.expected.hashCode();
        }

        @Override // ru.ok.android.externcalls.sdk.ml.model.ExtensionRule
        public boolean isSatisfied(Set<String> actual) {
            return actual.contains(this.expected);
        }

        public String toString() {
            return c0a.o("Required(expected=", this.expected, ")");
        }
    }

    boolean isSatisfied(Set<String> actual);
}
