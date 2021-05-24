**User:**

- id
- name
- password
- email
- phone
- archive
- role
- bucket_id
Role:
- CLIENT, MANAGER, ADMIN

**Product:**

- id
- title
- price
- categories

**Bucket:**

- id
- user
- products

**Category:**

- id
- title

**OrderStatus:**

- NEW, APPROVED, CANCELED, PAID, CLOSED

**OrderDetails:**

- id
- order
- product
- amount
- price

**Order:**

- id
- created
- updated
- user
- sum
- address
- OrderDetails
- OrderStatus
