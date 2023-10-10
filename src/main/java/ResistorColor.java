class ResistorColor {
    int colorCode(String color) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return java.util.Arrays.asList(colors()).indexOf(color);
    }

    String[] colors() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
