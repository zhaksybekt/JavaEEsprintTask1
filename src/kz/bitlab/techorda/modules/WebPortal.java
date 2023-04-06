package kz.bitlab.techorda.modules;

    public class WebPortal {
        Long id;
        String name;
        String status;
        String deadlineDate;
        String description;
        public WebPortal(){}

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDeadlineDate() {
            return deadlineDate;
        }

        public void setDeadlineDate(String deadlineDate) {
            this.deadlineDate = deadlineDate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public WebPortal(Long id, String name, String status, String deadlineDate, String description) {
            this.id = id;
            this.name = name;
            this.status = status;
            this.deadlineDate = deadlineDate;
            this.description = description;
        }
    }