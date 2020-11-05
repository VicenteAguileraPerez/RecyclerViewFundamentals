package com.vicenteaguilera.recyclerviewfundamentals.models;

public class ItemRecycler
{
        private String title;
        private String subtitle;

        public ItemRecycler(String title, String subtitle) {
            this.title = title;
            this.subtitle = subtitle;
        }

        public String getTitle() {
            return title;
        }

        public String getSubtitle() {
            return subtitle;
        }
}
